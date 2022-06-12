<%@page import="dao.UsuarioDAO"%>
<%@page import="model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<%
	String nome = (String) session.getAttribute("usuarioSession");
	%>
	<h2>
		Seja Bem vindo ao sistema,
		<%=nome%></h2>

	<div>
		<h2>Lista de Usuarios</h2>
	</div>

	<div>
		<table border=1>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>USUARIO</th>
				<th colspan=2></th>
			</tr>

			<%
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> lista = new ArrayList<Usuario>();

			lista = dao.listar();

			for (Usuario usuario : lista) {
			%>
			<tr>
				<td><%=usuario.getId()%></td>

				<td><%=usuario.getNome()%></td>

				<td><%=usuario.getUsuario()%></td>

				<td><img src="imagens/edit.png" width=24px></td>

				<td><a href="delete.jsp?id=<%=usuario.getId()%>"><img
						src="imagens/delete.png" width="24px" /></a></td>

				<td><img src="<%=usuario.getFoto()%>" width="50px" /></td>
				
			</tr>
			
			<%
			}
			%>
				
				
				
		</table>
		<div>
			<nav>
				<ul>
					<li><a href="index.html">Logout </a></li>
				</ul>
			</nav>
		</div>
	</div>

</body>
</html>