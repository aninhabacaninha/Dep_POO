package MathString;

import java.util.Scanner;

public class quest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, raiz;
		
		System.out.println("Insira um valor: ");
		num = sc.nextDouble();
		
		raiz = Math.sqrt(num);
		System.out.println(raiz);
	}
}
