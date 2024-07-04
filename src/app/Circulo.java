package app;

public class Circulo {
	
	private Integer raio;
	private Integer x;
	private Integer y;
	//private Integer pontuacaoCirculo;
	
	public Circulo(Integer raio) {
		this.raio = raio;
		this.x = 0;
		this.y = 0;		
	}
	
//	private void pontoRaio() {
//		this.xR = 
//	}

	public Integer getRaio() {
		return raio;
	}

	public void setRaio(Integer raio) {
		this.raio = raio;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", x=" + x + ", y=" + y + "]";
	}
}
