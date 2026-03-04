<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <form action='UserServlet' method='post'>
		    <label for="username">Username:</label>
		    <input type="text" id="username" name="username" required>
		    <br>
		    
		    <label for="password">Password:</label>
		    <input type="password" id="password" name="password" required>
		    <br>
		    
		    <label for="name">Full Name:</label>
		    <input type="text" id="name" name="name">
		    <br>
		    
		    <label for="email">Email:</label>
		    <input type="email" id="email" name="email" required>
		    <br>
		    
		    <label for="city">City:</label>
		    <input type="text" id="city" name="city">
             <br>
             <input type="submit" value="Sign Up">
     </form>
</body>
</html>