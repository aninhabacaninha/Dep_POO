package depPOO_lista2;

import java.util.Scanner;

public class Funcionariomain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		
		System.out.println("Informe seu nome: ");
		f1.setNome(sc.nextLine());
		System.out.println("Informe seu cargo: ");
		f1.setCargo(sc.nextLine());
		System.out.println("Informe seu código: ");
		f1.setCodigo(sc.nextInt());
		System.out.println("Informe seu salário: ");
		f1.setSalario(sc.nextDouble());
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCargo());
		System.out.println(f1.getSalario());
		
		System.out.println("O salário aumentado em 5% agora é "+f1.aumentarSalarioPorTempoDeServico());
		System.out.println("O salário aumentado com a taxa de 50% é de "+f1.aumentarSalario(50));
	}
}
