package quest3;

public class Carro {
    private int codigo, ano;
    private String modelo, marca, tipo;
    
    public Carro() {
        
    }
    
    public Carro(int codigo, int ano, String modelo, String marca, String tipo) {
        this.codigo = codigo;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
}
