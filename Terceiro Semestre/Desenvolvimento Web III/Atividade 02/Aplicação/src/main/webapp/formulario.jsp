<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="http://localhost:8080/Atividade_30-05_Resolucao/processa">
	
	<input type="text" name="field_name">
	<input type="date" name="field_date">
	<select name="field_language">
		<option value="ingles">Ingles</option>
		<option value="espanhol">Espanhol</option>
		<option value="portugue">Portugues</option>
	</select>
	<span>
		<input type="checkbox" name="field_habilidades" value="java">Java
	</span>
	<span>
		<input type="checkbox" name="field_habilidades" value="js">JavaScript
	</span>
	<span>
		<input type="checkbox" name="field_habilidades" value="css">CSS
	</span>
	<span>
		<input type="checkbox" name="field_habilidades" value="html">HTML
	</span>
	<input type="submit" name="field_send">
	</form>

</body>
</html>