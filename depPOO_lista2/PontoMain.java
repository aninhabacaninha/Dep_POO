package depPOO_lista2;

public class PontoMain {
	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		//Ponto 1
		p1.setPosicao(10, 5);
		System.out.println("X do primeiro ponto: " + p1.getX());
		System.out.println("Y do primeiro ponto: " + p1.getY());
		
		//Ponto 2
		p2.setPosicao(5, 10);
		System.out.println("X do segundo ponto: " + p2.getX());
		System.out.println("Y do segundo ponto: " + p2.getY());
	}
}
