<%@ page import="java.util.List" %>
<%@ page import="cdac.org.ecommerce.model.Product" %>
<%
    List<Product> cart = (List<Product>) session.getAttribute("cart");
    if(cart == null) {
        cart = new java.util.ArrayList<>();
    }
%>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
<h2>Your Cart</h2>

<% if(cart.isEmpty()) { %>
    <p>Your cart is empty. <a href="Category">Go to Categories</a></p>
<% } else { %>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <% for(Product p : cart) { %>
        <tr>
            <td><%=p.getProductName()%></td>
            <td><%=p.getProductPrice()%></td>
            <td>
                <form method="post" action="AddToCart">
                    <input type="hidden" name="productId" value="<%=p.getProductId()%>"/>
                    <input type="hidden" name="action" value="remove"/>
                    <input type="submit" value="Remove"/>
                </form>
            </td>
        </tr>
        <% } %>
    </table>
    <form method="post" action="Checkout">
        <input type="submit" value="Proceed to Checkout"/>
    </form>
<% } %>

</body>
</html>
