<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.lang.String" %>
<%@ page import="org.cdac.web.users.Users" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>

<% 
    Object userObj = session.getAttribute("currentUser");
    Users user = (Users)userObj;
%>	

     <a href="Logout">Logout</a>
    <div>Welcome <%=user.getUsername() %></div>
    <p>Your role: <%=user.getRole() %></p>
</body>
</html>