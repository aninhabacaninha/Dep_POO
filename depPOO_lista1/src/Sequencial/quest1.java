package Sequencial;

import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double a, b, c;
      double media;
    
     System.out.println("Primeira nota: ");
      a = sc.nextDouble();
     System.out.println("Segunda nota: ");
      b = sc.nextDouble();
     System.out.println();
      c = sc.nextDouble();
     
      media = (a + b + c) / 3;
      System.out.println("A média do aluno é " + media);
     
      sc.close();
    }
}
