<%--
  User: Lex Yu
  Date: 2023/4/1
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Cafe</title>
</head>
<body>

<%--<h1 align="center">Cafe Shop</h1>--%>
<h1 align="center">${title}</h1>
<hr>
<%--${coffee}--%>
<form action="processOrder">
<label for="item_name">Item Name :</label>
<input type="text" name="foodType" placeholder="food type ??" id="item_name">
<input type="submit" value="order now">
</form>
</body>
</html>
