package MathString;

import java.util.Scanner;

public class quest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		double dif, quadr;
		
		System.out.println("Digite um número: ");
		 n1 = sc.nextDouble();
		System.out.println("Digite um outro número: ");
		 n2 = sc.nextDouble();
		 
		 dif = n1 - n2;
		 quadr = Math.pow(dif, 2);
		 System.out.println(quadr);
	}
}
