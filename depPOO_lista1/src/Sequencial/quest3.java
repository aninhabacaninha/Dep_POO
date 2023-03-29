package Sequencial;

import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double mediaponderada;
        
        System.out.println("Digite a primeira nota: ");
         a = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
         b = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
         c = sc.nextDouble();
        
        mediaponderada = (a * 1 + b * 2 + c * 2)/5;
        System.out.println("A média ponderada é: " + mediaponderada);
    }
}
