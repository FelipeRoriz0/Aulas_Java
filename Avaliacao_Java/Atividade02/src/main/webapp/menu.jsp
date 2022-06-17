<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Valor</title>
<link rel="shortcut icon" href="imagens/hotel.png">

<style>
body {
	background: url(imagens/background.jpg);
}

h1 {
	color: white;
	font-size: 50px;
	text-align: center;
}
</style>

</head>
<body>


	<h1>
		<%
		double conta = (Double) session.getAttribute("conta");
		out.println("O VALOR DA HOSPEDAGEM É " + conta);
		%>
	</h1>

</body>
</html>