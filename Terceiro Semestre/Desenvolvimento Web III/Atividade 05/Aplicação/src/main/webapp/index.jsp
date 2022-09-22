<%@page import="servlets.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% Usuario usuario = (Usuario) session.getAttribute("usuario"); 
	Boolean estaLogado = (Boolean) session.getAttribute("esta_logado");
	
	if(estaLogado == null || estaLogado == false){
		response.sendRedirect("login.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina Inicial</title>
</head>
<body>


<h1>Bem vindo : <%= usuario %></h1>
<a href="logout">desconectar</a>


</body>
</html>