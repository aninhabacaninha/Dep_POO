package listaUsuario;

public class Usuario {
	private String nome;
	private int idade;
	private char sexo;
	private String endereco;
	private boolean interesseEducacao, interesseEconomia;
	private boolean interesseEsporte, interTecnologia;
	private int nivelConhecimentoInfo;
	private String infoAdicionais;
	private String senha;
	
	public Usuario() {
		
	}
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public int getIdade() { return idade; }
	
	public void setIdade(int idade) { this.idade = idade;}
	
	public char getSexo() { return sexo; }
	
	public void setSexo(char sexo) { this.sexo = sexo; }
	
	public String getEndereco() { return endereco; }
	
	public void setEndereco(String endereco) { this.endereco = endereco; }
	
	public boolean isInteresseEducacao() { return interesseEducacao; }
	
	public void setInteresseEducacao(boolean interesseEducacao) { this.interesseEducacao = interesseEducacao; }
	
	public boolean isInteresseEconomia() { return interesseEconomia; }
	
	public void setInteresseEconomia(boolean interesseEconomia) { this.interesseEconomia = interesseEconomia; }
	
	public boolean isInteresseEsporte() { return interesseEsporte; }
	
	public void setInteresseEsporte(boolean interesseEsporte) { this.interesseEsporte = interesseEsporte; }
	
	public boolean isInterTecnologia() { return interTecnologia; }
	
	public void setInterTecnologia(boolean interTecnologia) { this.interTecnologia = interTecnologia; }
	
	public int getNivelConhecimentoInfo() { return nivelConhecimentoInfo; }
	
	public void setNivelConhecimentoInfo(int nivelConhecimentoInfo) { this.nivelConhecimentoInfo = nivelConhecimentoInfo; }
	
	public String getInfoAdicionais() { return infoAdicionais; }
	
	public void setInfoAdicionais(String infoAdicionais) { this.infoAdicionais = infoAdicionais; }
	
	public String getSenha() { return senha; }
	
	public void setSenha(String senha) { this.senha = senha; }
	
	
}
