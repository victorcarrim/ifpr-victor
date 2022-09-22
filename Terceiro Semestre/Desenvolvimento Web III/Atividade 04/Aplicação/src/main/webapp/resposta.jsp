<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="cabecalho.jsp" %>

<% String chave = (String) request.getAttribute("attr_chave"); 
	System.out.println("e o valor foi.... +" + chave);
	out.println("e o valor foi.... + " + chave);
%>
</body>
</html>