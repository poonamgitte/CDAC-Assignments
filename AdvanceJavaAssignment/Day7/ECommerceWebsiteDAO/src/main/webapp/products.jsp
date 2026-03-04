<%@ page import="java.util.List" %>
<%@ page import="cdac.org.ecommerce.model.Product" %>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
%>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h2>Products</h2>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Image</th>
        <th>Action</th>
    </tr>
    <% for(Product p : products) { %>
    <tr>
        <td><%=p.getProductName()%></td>
        <td><%=p.getProductDescription()%></td>
        <td><%=p.getProductPrice()%></td>
        <td><img src="Images/<%=p.getProductImage()%>" height="60px" width="60px"/></td>
        <td>
            <form method="post" action="Product">
                <input type="hidden" name="productId" value="<%=p.getProductId()%>"/>
                <input type="hidden" name="action" value="delete"/>
                <input type="submit" value="Delete"/>
            </form>
            <form method="post" action="AddToCart">
                <input type="hidden" name="productId" value="<%=p.getProductId()%>"/>
                <input type="hidden" name="productName" value="<%=p.getProductName()%>"/>
                <input type="hidden" name="price" value="<%=p.getProductPrice()%>"/>
                <input type="submit" value="Add to Cart"/>
            </form>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>
