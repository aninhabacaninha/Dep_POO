package quest5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        System.out.println("Informe seu cpf: ");
         cliente.setCpf(sc.nextLine());
        System.out.println("Informe seu nome: ");
         cliente.setNome(sc.nextLine());
        System.out.println("Digite seu email: ");
         cliente.setEmail(sc.nextLine());
        System.out.println("Informe seu endereço (até 5 endereços): ");
         cliente.setValorEndereco(sc.nextLine());
    }
}
