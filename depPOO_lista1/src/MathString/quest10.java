package MathString;

import java.util.Scanner;

public class quest10 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase;
	
        System.out.println("Digite uma frase para ser invertida: ");
        frase = sc.nextLine();
	String fraseInvertida = new StringBuilder(frase).reverse().toString();
		
	System.out.println(fraseInvertida);
    }
}

