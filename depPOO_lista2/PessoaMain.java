package depPOO_lista2;

import java.util.Scanner;

public class PessoaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		 pessoa.nome = sc.nextLine();
		System.out.println("Informe seu sexo (M para Masculino e F para Feminino): ");
		 pessoa.sexo = sc.nextLine().charAt(0);
		System.out.println("Informe sua idade: ");
		 pessoa.idade = sc.nextInt();
		System.out.println("Digite seu peso: ");
		 pessoa.peso = sc.nextFloat();
		System.out.println("Digite sua altura: ");
		 pessoa.altura = sc.nextFloat();
		 
		pessoa.pesoIdeal();
	}
}
