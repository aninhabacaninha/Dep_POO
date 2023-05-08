package quest7;

public class Ponto {
	private int x;
	private int y;
	
	public double distancia(int x, int y) {
		double dist = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.x, 2));
		return dist; 
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
