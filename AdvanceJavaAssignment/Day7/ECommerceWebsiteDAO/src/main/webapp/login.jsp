<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="Authenticate" method="post">
    Username: <input type="text" name="userName" required/><br/>
    Password: <input type="password" name="password" required/><br/>
    <input type="submit" value="Login"/>
</form>

<% String error = request.getParameter("error");
   if("invalid".equals(error)) { %>
   <p style="color:red;">Invalid username or password</p>
<% } %>

<p>New user? <a href="register.jsp">Register here</a></p>
</body>
</html>
