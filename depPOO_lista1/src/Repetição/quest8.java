package Repetição;

public class quest8 {
    public static void main(String[] args) {
        int acum;
        acum = 0;
        
        for(int i = 1; i <= 500; i++) {
           if(i % 2 == 0) {
             acum = acum + i;
           }
        }
        
        System.out.println("Soma dos pares entre 1 e 500: " + acum);
    }
}
