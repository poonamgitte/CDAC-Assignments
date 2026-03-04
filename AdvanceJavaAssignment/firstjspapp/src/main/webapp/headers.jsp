<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border='1'>
		<tr>
			<th>Name</th>
			<th>Value</th>
		</tr>

	<%
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements())
		{
			String name =(String) headerNames.nextElement();
			String value = request.getHeader(name);
	%>
			<tr>
				<td><%=name %></td>
				<td><%=value %></td>
			</tr>
	<%
		}
	%>
			

</table>

</body>
</html>




