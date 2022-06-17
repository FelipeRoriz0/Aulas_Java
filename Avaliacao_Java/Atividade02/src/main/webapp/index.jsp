<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<link rel="shortcut icon" href="imagens/hotel.png">

<title>HOTEL SÃO PATRÍCIO</title>
<body>


	<h1>HOTEL SÃO PATRÍCIO</h1>
	<form action="hotelServlet" method="post" autocomplete="off">
		<p>Informe quantos dias irá passar no nosso hotel</p>

		<input type="number" name="dias"  required="required"/> <br> <input type="submit"
			name="calcular" value="Calcular" />

	</form>

</body>
</html>