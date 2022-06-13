package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioDAO {
	Connection cnx = null;
	
	public boolean incluirUsuario(Usuario usuario) {
		boolean resultado = true;
		int retornoQuery;
		
		cnx = DAO.createConnection();
		
		String sql = "INSERT INTO tb_usuarios(nome, usuario, senha) VALUES(?, ?, ?)";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getUsuario());
			ps.setString(3, usuario.getSenha());
			
			retornoQuery = ps.executeUpdate();
			
			if(retornoQuery <= 0) {
				resultado = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}
	
	public boolean excluirUsuario(int id) {
		boolean resultado = true;
		int retornoQuery;
		
		cnx = DAO.createConnection();
		
		String sql = "DELETE FROM tb_usuarios WHERE id=?";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			retornoQuery = ps.executeUpdate();
			
			if(retornoQuery <=0) {
				resultado = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;

	}
	public Usuario consultarUsuario(String login, String senha) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();
		
		String sql = "SELECT * FROM tb_usuarios WHERE usuario = ? AND senha=?";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setString(1, login);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setFoto(rs.getString("foto"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public List<Usuario> listar() {
		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		ResultSet rs = null;
		Usuario usuario = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_usuarios;";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setFoto(rs.getString("foto"));
				
				listaDeUsuarios.add(usuario);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaDeUsuarios;
	}
}
