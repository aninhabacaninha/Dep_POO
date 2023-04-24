package MathString;

import java.util.Scanner;

public class quest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, procurar;
		
		System.out.println("Digite uma frase: ");
		 frase = sc.nextLine();
		System.out.println("Digite uma palavra para procurar na frase: ");
		 procurar = sc.nextLine();
		
		System.out.println(frase.toLowerCase().contains(procurar.toLowerCase()));
	}
}
