package quest6;

public class ItemVenda {
    private Venda codigo;
    private Produto idProduto, quantProduto, valorTotalProduto;
    
    public ItemVenda() {
        
    }
    
    public ItemVenda(Venda codigo, Produto idProduto, Produto quantProduto, Produto valorTotalProduto) {
        this.codigo = codigo;
        this.idProduto = idProduto;
        this.quantProduto = quantProduto;
        this.valorTotalProduto = valorTotalProduto;
    }
    
    public Venda getCodigo() {
        return codigo;
    }

    public void setCodigo(Venda codigo) {
        this.codigo = codigo;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Produto getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(Produto quantProduto) {
        this.quantProduto = quantProduto;
    }

    public Produto getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(Produto valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
        
        //valorTotalProduto = getValor() * quantProduto;
    }
}
