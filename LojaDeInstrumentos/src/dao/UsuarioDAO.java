package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		String sql = "SELECT codigo, nome, senha, saldo FROM Usuario";
		try {
			Connection conexao = Conexao.getConexao();
			Statement stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int codigo = rs.getInt("codigo");
				String nome = rs.getString("nome");
				String senha = rs.getString("senha");
				double saldo = rs.getDouble("saldo");
				
				Usuario usuario = new Usuario(codigo, nome, senha, saldo);
				usuarios.add(usuario);
				System.out.println(usuario.toString());
			}
			conexao.close();
		} catch(SQLException ex) {
			System.out.println(ex.toString());
		}
		return usuarios;
	}
}