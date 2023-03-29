package Sequencial;

import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        double mediaponderada;
        
        System.out.println("Digite o primeiro valor: ");
         a = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
         b = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
         c = sc.nextDouble();
        System.out.println("Digite o quarto valor: ");
         d = sc.nextDouble();
        
        mediaponderada = (a * 1 + b * 2 + c * 3 + d * 4)/8;
        System.out.println("A média ponderada é: " + mediaponderada);
    }
}
