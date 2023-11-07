package model;

import java.util.ArrayList;

import dao.VendedorDAO;

public class Vendedor {
	private int codigo;
	private String nome;
	private ArrayList<Produto> produtos;
	private double saldo;
	
	public Vendedor() {}
	
	public Vendedor(int codigo, String nome, ArrayList<Produto> produtos, double saldo) {
		this.codigo = codigo;
		this.nome = nome;
		this.produtos = produtos;
		this.saldo = saldo;
	}
	
	public Vendedor(int codigo, String nome, double saldo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Vendedor(String nome, ArrayList<Produto> produtos, double saldo) {
		this.nome = nome;
		this.produtos = produtos;
		this.saldo = saldo;
	}
	
	public int getCodigo() { return codigo; }
	public void setCodigo(int codigo) { this.codigo = codigo; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public ArrayList<Produto> geProdutos() { return produtos; }
	public void setProdutos(ArrayList<Produto> produtos) { this.produtos = produtos; }
	
	public double getSaldo() { return saldo; }
	public void setSaldo(double saldo) { this.saldo = saldo; }
	
	@Override
	public String toString() {
		return "Vendedor{ " + "Código = " + codigo +
				", Nome = " + nome +
				", Produtos = " + produtos +
				", Saldo = " + saldo + "}";
	}

	public boolean cadastrarVendedor() {
		return VendedorDAO.addVendedor(this);
	}
}