package depPOO_lista2;

import java.util.Scanner;

public class Temperaturamain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Temperatura celsius = new Temperatura();
		
		System.out.println("Informe a temperatura em celsius:");
		celsius.setTemperatura(sc.nextFloat());
		
		System.out.println("O valor em celsius é: "+celsius.getTemperaturaEmCelsius());
		System.out.println("O valor em Fahrenheit é: "+celsius.getTemperaturaEmFahrenheit());
	}
}
