package Arrays;

import java.util.Scanner;

public class quest12 {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
           for(int j = 0; j < 5; j++) {
              System.out.println("Entre com um valor: ");
              matriz [i][j] = sc.nextDouble();
           }
        }
        
        for(int i = 0; i < 5; i++) {
           for(int j = 0; j < 5; j++) {
              matriz[i][j] = matriz[i][j]/10;
              System.out.print(matriz[i][j] + "\t");
           }
           System.out.println("\n");
        }
    }
}
