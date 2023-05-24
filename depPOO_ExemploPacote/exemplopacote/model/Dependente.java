package exemplopacote.model;

public class Dependente extends Pessoa {
    protected int idade;
    
    public Dependente(int codigo, String nome, int idade) {
        super(codigo, nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
