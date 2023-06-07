package MathString;

import java.util.Scanner;

public class quest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	String frase, procurar;
        int cont = 0;
		
	System.out.println("Digite uma frase: ");
	 frase = sc.nextLine();
	System.out.println("Digite uma palavra para procurar na frase: ");
	 procurar = sc.nextLine();
	
         if(frase.contains(procurar) == true) {
            cont++;
         }
	System.out.println(cont);
    }
}
