<%@ page import="cdac.org.ecommerce.model.CreditCard" %>
<html>
<head>
    <title>Payment</title>
</head>
<body>
<h2>Payment Details</h2>

<form method="post" action="Payment">
    Card Holder Name: <input type="text" name="cardHolder" required/><br/>
    Card Number: <input type="text" name="cardNumber" required/><br/>
    Expiry Month: <input type="text" name="expiryMonth" required/><br/>
    Expiry Year: <input type="text" name="expiryYear" required/><br/>
    CVV: <input type="text" name="cvv" required/><br/>
    Amount: <input type="text" name="amount" value="<%=request.getAttribute("totalAmount")%>" readonly/><br/>
    <input type="submit" value="Pay"/>
</form>

</body>
</html>
