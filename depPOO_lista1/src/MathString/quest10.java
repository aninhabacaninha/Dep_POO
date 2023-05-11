package MathString;

import java.util.Scanner;

public class quest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		String fraseInvertida = new StringBuilder(frase).reverse().toString();
		
		System.out.println(fraseInvertida);
	}
}
