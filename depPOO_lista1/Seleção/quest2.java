package Seleção;

import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Insira um valor para a: ");
         a = sc.nextInt();
        System.out.println("Insira um valor para b: ");
         b = sc.nextInt();
         
        if(a < b) {
          System.out.println("O menor valor é A: " + a);
      } else if(b < a) {
          System.out.println("O menor valor é B: " + b);
      }
    }
}
