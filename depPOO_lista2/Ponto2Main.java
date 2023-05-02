package depPOO_lista2;

import java.util.Scanner;

public class Ponto2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		//Ponto 1
		System.out.println("Digite um valor para o ponto x: ");
		 p1.x = sc.nextInt();
		System.out.println("Digite um valor para o ponto y: ");
		 p1.y = sc.nextInt();
		
		System.out.println("X do ponto 1: " + p1.getX());
		System.out.println("Y do ponto 1: " + p1.getY());
		
		//Ponto 2
		System.out.println("Digite um valor para o ponto x: ");
		 p2.x = sc.nextInt();
		System.out.println("Digite um valor para o ponto y: ");
		 p2.y = sc.nextInt();
	
		System.out.println("X do ponto 2: " + p2.getX());
		System.out.println("Y do ponto 2: " + p2.getY());
	}
}
