<%@ page import="java.lang.String" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
<style>
        body { font-family: Arial, sans-serif; background-color: #f8f9fa; text-align: center; padding: 50px; }
        .error-box { border: 1px solid #dc3545; padding: 20px; border-radius: 5px; background-color: #f8d7da; color: #721c24; display: inline-block; }
        h1 { color: #dc3545; }
        p { margin-top: 15px; }
        a { color: #007bff; text-decoration: none; }
</style>
</head>
<body>

    <div class="error-box">
          <% String error = (String)request.getAttribute("error");%>
           <p><%= error %></p>
           <p>If you were trying to sign up, please check your details and try again.</p>
           <p>
            <a href="login.jsp">Go back to the Home Page</a>
        </p>  
    </div>   
</body>
</html>