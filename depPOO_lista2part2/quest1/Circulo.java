package quest1;

public class Circulo extends Ponto {
    private double raio;
    
    public Circulo(double raio, int x, int y) {
        super(x, y);
        this.raio = raio;
    }
    
    public Circulo() {
        
    }
    
    public double getRaio() {
	return raio;
    }

    public void setRaio(double raio) {
	this.raio = raio;
    }
}
