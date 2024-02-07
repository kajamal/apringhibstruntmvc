<!-- index.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required/><br/>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required/><br/>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>
