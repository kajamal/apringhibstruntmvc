<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    Welcome <%= session.getAttribute("username") %>
</body>
</html>
