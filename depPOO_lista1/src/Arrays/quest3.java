package Arrays;

import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int cont = 0;
    
        for(int i = 0; i < 10; i++) {
            System.out.println("Entre com um valor: ");
            notas[i] = sc.nextDouble();
       }
        
        for(int i = 0; i < 10; i++) {
           if(notas[i] >= 5) {
               cont++;
           }
        }
      System.out.println(cont + "alunos com nota acima da média!");
    }
}
