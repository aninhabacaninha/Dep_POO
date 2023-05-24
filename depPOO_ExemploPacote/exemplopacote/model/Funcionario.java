package exemplopacote.model;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(int codigo, String nome, float salario) {
        super(codigo, nome);
        this.salario = salario;
    }
}
