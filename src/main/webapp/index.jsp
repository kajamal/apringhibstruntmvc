<!-- index.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <style>
    form {
        max-width: 300px;
        margin: 50px auto;
        padding: 20px;
        background-color: #f4f4f4;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    label {
        display: block;
        margin-bottom: 8px;
        font-weight: bold;
    }

    input {
        width: 100%;
        padding: 8px;
        margin-bottom: 16px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4caf50;
        color: white;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
    br {
        margin-bottom: 12px;
    }
</style>
</head>
<body>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required/><br/>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required/><br/>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>
