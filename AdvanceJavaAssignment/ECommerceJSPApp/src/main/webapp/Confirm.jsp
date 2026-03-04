<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="objUser" class="org.cdac.ajava.Users" scope="session" />

	<jsp:setProperty name="objUser" property="*" />

	<%
	Class.forName("com.mysql.cj.jdbc.Driver");


	%>



	Username:
	<jsp:getProperty name="objUser" property="userName" />
	Name:
	<jsp:getProperty name="objUser" property="name" />
	Email:
	<jsp:getProperty name="objUser" property="email" />

	<a href='registeruser.jsp'>Register</a>&nbsp;&nbsp;
</body>
</html>