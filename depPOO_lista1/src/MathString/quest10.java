package MathString;

import java.util.Scanner;

public class quest10 {
	public static void main(String[] args) {
		String frase, fraseInvertida;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		frase = sc.nextLine();
	
		fraseInvertida = new StringBuilder(frase).reverse().toString();
		
		System.out.println(fraseInvertida);
	}
}
