package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pontuacao = 0;
		int cCirculos = sc.nextInt();
		int tTiros = sc.nextInt();
		Circulo Circulos[] = new Circulo[cCirculos];
		int qtdCirculo = cCirculos - 1;
		
		for(int i=0; i<cCirculos; i++) {
			int raio = sc.nextInt();
			Circulos[i] = new Circulo(raio);
		}
		
		for (int i = 0; i<tTiros; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>Circulos[cCirculos - 1].getRaio() || y>Circulos[cCirculos - 1].getRaio() || 
					x<Circulos[cCirculos - 1].getRaio()*(-1) || y<Circulos[cCirculos - 1].getRaio()*(-1)) {
				pontuacao +=0;
			} else {
				for(int j = 0; j<cCirculos; j++) {
					if(qtdCirculo == 0) {
						if(calcularXeYCirvulo(x, y) <= Math.pow(Circulos[qtdCirculo].getRaio(),2)) {
							pontuacao += (j+1);
						}
					} else if(calcularXeYCirvulo(x, y) <= Math.pow(Circulos[qtdCirculo].getRaio(),2) && calcularXeYCirvulo(x, y) > Math.pow(Circulos[qtdCirculo-1].getRaio(),2)) {
						pontuacao += (j+1);
						break;
					}
					qtdCirculo--;
				}
			}
			qtdCirculo = cCirculos - 1;
		}
		
		System.out.println(pontuacao);
		sc.close();
	}
	
	private static double calcularXeYCirvulo(int x, int y) {
		// x²+y²<=r² -> 
		double result = (Math.pow(x, 2) + Math.pow(y, 2));
		return result;
	}
}