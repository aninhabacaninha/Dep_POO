package quest5;

public class Endereco {
    private String logradouro, complemento, Bairro, cidade, cep;
    private int numero;
    
    public Endereco() {
        
    }
    
    public Endereco(String logradouro, String complemento, String Bairro, String cidade, String cep, int numero) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.Bairro = Bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
