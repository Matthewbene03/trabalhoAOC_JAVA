package app;

public class Tacadas {

	private Integer xPosicao;
	private Integer yPosicao;
	
	
	public Tacadas(Integer xPosicao, Integer yPosicao) {
		super();
		this.xPosicao = xPosicao;
		this.yPosicao = yPosicao;
	}
	
	public Integer getxPosicao() {
		return xPosicao;
	}
	public void setxPosicao(Integer xPosicao) {
		this.xPosicao = xPosicao;
	}
	public Integer getyPosicao() {
		return yPosicao;
	}
	public void setyPosicao(Integer yPosicao) {
		this.yPosicao = yPosicao;
	}

	@Override
	public String toString() {
		return "Tacadas [xPosicao=" + xPosicao + ", yPosicao=" + yPosicao + "]";
	}
}
