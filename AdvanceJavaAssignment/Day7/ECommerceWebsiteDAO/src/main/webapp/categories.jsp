<%@ page import="java.util.List" %>
<%@ page import="cdac.org.ecommerce.model.Category" %>
<%
    List<Category> categories = (List<Category>) request.getAttribute("categories");
%>
<html>
<head>
    <title>Categories</title>
</head>
<body>
<h2>Categories</h2>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Image</th>
        <th>Action</th>
    </tr>
    <% for(Category c : categories) { %>
    <tr>
        <td><a href="Product?catId=<%=c.getCategoryId()%>"><%=c.getCategoryName()%></a></td>
        <td><%=c.getDescription()%></td>
        <td><img src="Images/<%=c.getImage()%>" height="60px" width="60px"/></td>
        <td>
            <form method="post" action="Category">
                <input type="hidden" name="categoryId" value="<%=c.getCategoryId()%>"/>
                <input type="hidden" name="action" value="delete"/>
                <input type="submit" value="Delete"/>
            </form>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>
