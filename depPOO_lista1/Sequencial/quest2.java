package Sequencial;

import java.util.Scanner;

public class quest2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b;
      double soma, subtr, divis, multpl;
      
      
      System.out.println("Digite um valor para a: ");
       a = sc.nextInt();
      System.out.println("Digite um valor para b: ");
       b = sc.nextInt();
     
      soma = a + b;
      subtr = a - b;
      multpl = a * b;
      divis = a / b;
      
      System.out.println("A soma é: " + soma);
      System.out.println("A subtração é: " + subtr);
      System.out.println("A multiplicação é: " + multpl);
      System.out.println("A divisão é: " + divis);
  }   
}
