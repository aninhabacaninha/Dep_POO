package quest6;

public class Venda {
    private int codigo;
    private float valorTotal;
    
    public Venda(int codigo, float valorTotal) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
