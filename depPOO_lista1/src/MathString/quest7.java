package MathString;

import java.util.Scanner;

public class quest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2;
		double dist;
		
		System.out.print("Insira um valor para x1: ");
		 x1 = sc.nextDouble();
		System.out.print("Insira um valor para y1: ");
		 y1 = sc.nextDouble();
		System.out.print("Insira um valor para x2: ");
		 x2 = sc.nextDouble();
		System.out.print("Insira um valor para y2: ");
		 y2 = sc.nextDouble();
		
		dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(dist);
		
		if(dist > 5) {
			System.out.println("Os dois estão distantes");
	   } else if(dist > 0 && dist < 5) {
		   System.out.println("Os dois estão próximos");
	   } else if(dist == 0) {
		   System.out.println("Os dois estão no mesmo ponto");
	   }
	}
}
