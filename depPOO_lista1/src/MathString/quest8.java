package MathString;

import java.util.Scanner;

public class quest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tel, num;
		
		System.out.println("Digite seu número de telefone: ");
		 tel = sc.nextLine();
		
		num = tel.substring(0, 4);
		
		if(num.equals("(92)")) {
			System.out.println("Telefone inicia com 92");
		}
	}
}
