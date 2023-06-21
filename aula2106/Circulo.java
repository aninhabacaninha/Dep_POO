package aula2106;

import java.awt.Color;

public class Circulo {
    private int x, y;
    private int raio;
    private Color cor;
    
    public Circulo(int x, int y, int raio) {
       this.x = x;
       this.y = y;
       this.raio = raio;
       this.cor = Color.BLUE;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
}
