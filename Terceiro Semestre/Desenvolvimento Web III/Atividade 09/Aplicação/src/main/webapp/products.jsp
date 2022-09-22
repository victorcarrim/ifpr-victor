<%@page import="models.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produtos</title>
</head>
<body>

<% 
	List<Product> products = (List<Product>) request.getAttribute("products");
	
%>
<table>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>id</td>
		<td>name</td>
		<td>price</td>
		<td>description</td>
		<td>imageUri</td>
	</tr>
	<% for(Product p: products){ %>
	<tr>
		<td><%= p.getId() %></td>
		<td><%= p.getName() %></td>
		<td><%= p.getPrice() %></td>
		<td><%= p.getDescription() %></td>
		<td><%= p.getImageUri() %></td>
	</tr>
	<% } %>
</table>
</body>
</html>