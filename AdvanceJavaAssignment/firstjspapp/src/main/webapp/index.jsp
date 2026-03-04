<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int tmp=0;tmp<25;tmp++)
		{
	%>
		<h1>Time is : <%=new java.util.Date() %></h1>
		
	<%
		}
	%>

</body>
</html>