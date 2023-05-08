package depPOO_lista2;

public class PessoaFisica {
	
	private String nome;
	private String cpf;
	private int idade;
	
	public void caixaAlta() {
		setNome(nome.toUpperCase());
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
