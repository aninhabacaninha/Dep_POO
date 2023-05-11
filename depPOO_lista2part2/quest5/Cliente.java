package quest5;

public class Cliente {
	private String cpf, nome, email;
    Endereco[] endereco = new Endereco[5];

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionaEndereco(Endereco ender) {
    	for(int i = 0; i < 5; i++) {
    		if(endereco[i] == null) {
    			endereco[i] = ender;
    		}
    	}
    }
}
