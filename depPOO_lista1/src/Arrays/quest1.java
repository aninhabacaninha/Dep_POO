package Arrays;

public class quest1 {
    public static void main(String[] args) {
        int[] vetor;
        vetor = new int[100];
        
        for(int i = 0; i < 100; i++) {
            if(i%2 == 0) {
              vetor[i] = 1;
           } else {
              vetor[i] = 0;  
           }
        }
        
        for(int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + "\t");
        }
    }
}
