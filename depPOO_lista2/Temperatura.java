package depPOO_lista2;

public class Temperatura {
	
	private float temperatura;
	
	public float getTemperaturaEmCelsius() {
		return temperatura;
	}
	
	public double getTemperaturaEmFahrenheit() {
		double fhrnt = temperatura*1.8+32;
		return fhrnt;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
}
