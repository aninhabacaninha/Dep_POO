package depPOO_lista2;

public class PessoaFisicaMain {
	public static void main(String[] args) {
		PessoaFisica funcionario = new PessoaFisica();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		funcionario.setNome(sc.nextLine());
		System.out.println("Informe sua cpf:");
		funcionario.setCpf(sc.nextLine());
		System.out.println("Informe seu idade:");
		funcionario.setIdade(sc.nextInt());
		
		funcionario.caixaAlta();
		System.out.println("O nome em maiúsculo: "+funcionario.getNome());
	}
}
