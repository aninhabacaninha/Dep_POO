package model;

import dao.UsuarioDAO;

public class Usuario {
	private int codigo;
	private String nome;
	private String senha;
	private double saldo;
	
	public Usuario() {}
	
	public Usuario(int codigo, String nome, String senha, double saldo) {
		this.codigo = codigo;
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
	}
	 
	public Usuario(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public int getCodigo() { return codigo; }
	public void setCodigo(int codigo) { this.codigo = codigo; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public String getSenha() { return senha; }
	public void setSenha(String senha) { this.senha = senha; }

	public double getSaldo() { return saldo; }
	public void setSaldo(double saldo) { this.saldo = saldo; }

	@Override
	public String toString() {
		return "Usuario{ " + "Código = " + codigo +
				", Nome = " + nome +
				", Senha = " + senha +
				", Saldo = " + saldo + "}";
	}
	
	public boolean cadastrarUsuario() {
		return UsuarioDAO.addUsuario(this);
	}
}