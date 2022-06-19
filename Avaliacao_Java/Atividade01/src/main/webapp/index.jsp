<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabuada</title>
</head>
<body>
	<h1>Tabuada</h1>
	
	<form action="tabuadaServlet" method="post">
		<label>Digite um número</label>
		<input type="number" name="calcular" required="required">
		<input type="submit" name="calculos">
	
	</form>
	
</body>
</html>