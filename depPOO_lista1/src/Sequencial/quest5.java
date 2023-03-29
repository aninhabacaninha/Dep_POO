package Sequencial;

import java.util.Scanner;

public class quest5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double celsius, fahr;
    
      System.out.println("Insira a temperatura em Celsius: ");
       celsius = sc.nextDouble();
      
      fahr = (9 * celsius + 160)/5;
      System.out.println("A temperatura em Fahrenheit: " + fahr + "°F");
   } 
}
