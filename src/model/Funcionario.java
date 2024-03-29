package model;

public class Funcionario {
	private int codigo;
	private String nome, cargo;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario(int codigo, String nome, String cargo, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
 
	public int getCodigo() { return codigo; }
	
	public void setCodigo(int codigo) { this.codigo = codigo; }
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getCargo() { return cargo; }
	
	public void setCargo(String cargo) { this.cargo = cargo; }
	
	public double getSalario() { return salario; }
	
	public void setSalario(double salario) { this.salario = salario; }

	@Override
	public String toString() {
		return "Nome = " + nome + ", Cargo = " + cargo + ", Salário = " + salario;
	}
	
}
