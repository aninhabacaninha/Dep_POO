package MathString;

import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        
        System.out.println("Digite um número para a: ");
         a = sc.nextDouble();
        
        double resultado = Math.abs(a);
        System.out.println(resultado);
    }
}
