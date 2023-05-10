package quest6;

public class Produto {
    private int id;
    private String descricao;
    private float quant, valor;
    
    public Produto(int id, String descricao, float quant, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.quant = quant;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getQuant() {
        return quant;
    }

    public void setQuant(float quant) {
        this.quant = quant;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
