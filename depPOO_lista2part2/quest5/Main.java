package quest5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Cliente cliente = new Cliente();
	        Endereco end = new Endereco();
	        int numero = 0;
	        
	        System.out.println("Informe seu cpf: ");
	         cliente.setCpf(sc.nextLine());
	        System.out.println("Informe seu nome: ");
	         cliente.setNome(sc.nextLine());
	        System.out.println("Digite seu email: ");
	         cliente.setEmail(sc.nextLine());
	        
	        System.out.println("Informe um número para adicionar endereço (no máx 5): ");
	        for(numero = 0; numero < sc.nextInt() && numero < 5; numero++) {
	        	sc.nextLine();
	        	System.out.println("Informe seu Logradouro: ");
	        	 end.setLogradouro(sc.nextLine());
	        	System.out.println("Informe seu Complemento: ");
	        	 end.setComplemento(sc.nextLine());
	        	System.out.println("Informe seu Bairro: ");
	        	 end.setBairro(sc.nextLine());
	        	System.out.println("Informe seu Cidade: ");
	        	 end.setCidade(sc.nextLine());
	        	System.out.println("Informe seu CEP: ");
	        	 end.setCep(sc.nextLine());
	        	System.out.println("Informe seu número: ");
	        	 end.setNumero(sc.nextInt());
	       }
	        
	        cliente.adicionaEndereco(end);
	}
}
