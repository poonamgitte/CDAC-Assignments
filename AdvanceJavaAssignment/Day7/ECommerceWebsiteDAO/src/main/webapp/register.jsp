<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h2>Register</h2>
<form action="Register" method="post">
    Name: <input type="text" name="name" required/><br/>
    Username: <input type="text" name="userName" required/><br/>
    Password: <input type="password" name="password" required/><br/>
    Confirm Password: <input type="password" name="confirmPassword" required/><br/>
    Email: <input type="email" name="email" required/><br/>
    City: <input type="text" name="city" required/><br/>
    <input type="submit" value="Register"/>
</form>
<p>Already registered? <a href="login.jsp">Login here</a></p>
</body>
</html>
