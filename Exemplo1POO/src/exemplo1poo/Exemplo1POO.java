package exemplo1poo;

public class Exemplo1POO {
    public static void main(String[] args) {
        //ponto
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        
        p1.setPosicao(10, 5);
        p2.setPosicao(7, 7);
                 
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
        
        System.out.println("X: " + p2.getX());
        System.out.println("Y: " + p2.getY());
        
        //circulo
        Círculo circulo = new Círculo();
         circulo.x = 10;
         circulo.y = 10;
         circulo.raio = 5;
        double area = circulo.CalcularArea();
    }
}
