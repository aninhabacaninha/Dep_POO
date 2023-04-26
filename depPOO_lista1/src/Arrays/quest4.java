package Arrays;

import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[20];
        
        for(int i = 0; i < 20; i++) {
            System.out.println("Digite um número: ");
             numeros[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 20; i++) {
            if(numeros[i] == 10) {
                System.out.println(i + "\t");
            }
        }
    }
}
