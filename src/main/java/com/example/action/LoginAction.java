package com.example.action;

import com.example.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() {
        if (isValidUser()) {
            // Set username in session or action context
            ActionContext.getContext().getSession().put("username", username);

            // Save user data to the database
            saveUserToDatabase();

            return SUCCESS;  // Successful login
        } else {
            addActionError("Invalid credentials. Please try again.");
            return INPUT;  // Unsuccessful login
        }
    }

    private boolean isValidUser() {
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }

    private void saveUserToDatabase() {
        // Hibernate configuration
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Create a new User object
        User user = new User();
        user.setUsername(username);
        user.setPhoneNumber(password);

        // Open a new session and transaction
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Save the user object to the database
            session.save(user);

            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the session factory
            sessionFactory.close();
        }
    }
}
