package Seleção;

import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        
        System.out.println("Entre com a sua idade: ");
         idade = sc.nextInt();
        
        if(idade >= 18) {
          System.out.println("O usuário é de maior");
       } else {
          System.out.println("O usuário é de menor");
       }
    }
}
