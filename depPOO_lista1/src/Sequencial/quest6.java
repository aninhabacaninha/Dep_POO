package Sequencial;

import java.util.Scanner;

public class quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahr;
        
        System.out.println("Insira uma porcentagem em Fahrenheit: ");
         fahr = sc.nextDouble();
        
        celsius = (fahr - 32) * (5F/9F);
        System.out.println("A temperatura em Celsius: " + celsius + "°C");
    }
}
