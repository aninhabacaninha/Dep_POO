package depPOO_lista2;

public class Funcionario {
	
	private int codigo;
	private String nome, cargo;
	private double salario;
	
   public double aumentarSalarioPorTempoDeServico() {
		double salario = getSalario() * (5/100);
		return salario;
	}
	
	public double aumentarSalario(double taxa) {
		double salario = getSalario() * (taxa/100);
		return salario;
	}
   
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
