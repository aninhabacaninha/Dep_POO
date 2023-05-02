package depPOO_lista2;

public class Pessoa {
	String nome;
	char sexo;
	int idade;
	float peso, altura;
	
	public double pesoIdeal() {
		double pesoIdeal;
		
		if(sexo == 'M') {
			pesoIdeal = ((72.7 * altura) - 58);
			System.out.println("O seu peso ideal é: " + pesoIdeal);
		} else {
			pesoIdeal = ((62.1 * altura) - 44.7);
			System.out.println("O seu peso ideal é: " + pesoIdeal);
		}
		
		return pesoIdeal;
	}
}
