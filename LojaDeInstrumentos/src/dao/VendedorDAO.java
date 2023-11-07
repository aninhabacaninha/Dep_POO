package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Vendedor;

public class VendedorDAO {
	public static boolean addVendedor(Vendedor vendedor) {
		String sql = "INSERT INTO Vendedor (nome, saldo) VALUES (?,?)";
		try {
			Connection conexao = Conexao.getConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, vendedor.getNome());
			stmt.setDouble(2, vendedor.getSaldo());
			stmt.execute();
			
			return true;
		} catch(SQLException ex) {
			System.out.println(ex.toString());
		}
		return false;
	}
	
	public static List<Vendedor> listarVendedor() {
		List<Vendedor> vendedores = new ArrayList<>();
		String sql = "SELECT codigo, nome, saldo FROM Vendedor";
        try{
            Connection conexao = Conexao.getConexao();
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                double saldo = rs.getDouble("saldo");
                
                Vendedor vendedor = new Vendedor(codigo, nome, saldo);
                vendedores.add(vendedor);
                System.out.println(vendedor.toString());
            }
            conexao.close();
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
		return vendedores;
	}
}