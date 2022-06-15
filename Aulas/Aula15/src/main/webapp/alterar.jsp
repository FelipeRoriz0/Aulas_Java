<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de inclusão</title>
</head>
<body>
	<form action="AlterarUsuarioServlet" method="post">
		<label> Nome: </label>
		<input type="text" name="nome" id="nome" placeholder="nome do usuario" size="40"/> <br>
		<label> Usuario: </label>
		<input type="text" name="usuario" id="usuario" placeholder="Login para usuario" size="40"/> <br>
		<label> Senha: </label>
		<input type="password" name="senha" id="senha" placeholder="Senha" size="40"/> <br>
		<input type="submit" value="gravar"/>
		
		
		<div>
			<nav>
				<ul>
					<li><a href="menu.jsp">Home </a></li>
				</ul>
			</nav>
		</div>
		
	
	</form>
</body>
</html>