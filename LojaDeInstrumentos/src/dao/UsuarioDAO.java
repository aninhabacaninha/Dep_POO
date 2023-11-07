package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDAO {
	public static boolean addUsuario(Usuario usuario) {
		String sql = "INSERT INTO Usuario (nome, senha, saldo) VALUES (?, ?, ?)";
		try {
			Connection conexao = Conexao.getConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setDouble(3, usuario.getSaldo());
			stmt.execute();
			
			return true;
		} catch(SQLException ex) {
			System.out.println(ex.toString());
		}
		return false;
	}
}
