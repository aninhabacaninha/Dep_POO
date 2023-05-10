package quest4;

public class Produto {
    private int codigo;
    private String descricao, estado;
    private int quant;
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
        
        if(quant > 0) {
            this.estado = "Disponível";
       } else {
            this.estado = "Não disponível";
       }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public double AumentarValorDoProduto() {
        valor = getValor() * (7/100);
        return valor;
    }
    
    public double AumentarValorDoProduto(double taxa) {
        valor = getValor() * (taxa/100);
        return valor;
    }
}
