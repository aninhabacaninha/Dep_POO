package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConexao() {
		try {
			String database = "jdbc:mysql://127.0.0.1:3306/LOJINHA";
			String usuario = "root";
			String senha = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexao = DriverManager.getConnection(database, usuario, senha);
			return conexao;
		} catch(ClassNotFoundException ex1) {
			System.out.println(ex1.toString());
		} catch (SQLException ex2) {
			System.out.println(ex2.toString());
		}
		return null;
	}
}