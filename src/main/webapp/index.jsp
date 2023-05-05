<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/display_discount">
    <input type="text" name="Product_Description" placeholder="Mô tả của sản phẩm" value=""></br>
    <input type="text" name="list_Price" placeholder="Giá niêm yết của sản phẩm" value=""></br>
    <input type="text" name="discount_Percent" placeholder="Tỷ lệ chiết khấu" value=""></br></br>
    <input type="submit" id="submit" value="Calculate Discount"/>
</form>
</body>
</html>