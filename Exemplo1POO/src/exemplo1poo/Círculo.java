package exemplo1poo;

public class Círculo {
    int x;
    int y;
    int raio;
    
    public double CalcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
