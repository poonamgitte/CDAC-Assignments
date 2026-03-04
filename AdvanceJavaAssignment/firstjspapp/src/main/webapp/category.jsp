<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dac_feb",
				"dac","Dac@1234");
		PreparedStatement psCategory = connection.prepareStatement("select * from category");
		ResultSet result = psCategory.executeQuery();)
		{
	%>
<table border='1'>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>image</th>
		</tr>
		
		<%
			while(result.next())
			{
		%>
				<tr>
					<td><%=result.getString(2) %></td>
					<td><%=result.getString(3) %></td>
					<td><%=result.getString(4) %></td>
				</tr>
		<%
			}
		}
		%>
		
</table>
</body>
</html>