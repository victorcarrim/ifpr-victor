<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="models.Aluno"%>
<%@page import="models.Curso"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

Aluno aluno = new Aluno();
Curso curso = new Curso();

aluno.setNome("Victor");
aluno.setRA("9859040");

curso.setNome("TADS");

aluno.setCurso(curso);

request.setAttribute("aluno", aluno);


%>

${aluno.nome}
${aluno.RA}
${aluno.curso.nome}



</body>
</html>