package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//List<Circulo> listCirculos = new ArrayList<>();		 

		int pontuacao = 0;
		int cCirculos = sc.nextInt();
		int tTiros = sc.nextInt();
		Circulo Circulos[] = new Circulo[cCirculos];
		int qtdCirculo = cCirculos - 1;
		
		for(int i=0; i<cCirculos; i++) {
			int raio = sc.nextInt();
			Circulos[i] = new Circulo(raio);
		}
		
		for (Circulo circulo : Circulos) {
			System.out.println(circulo);
		}
		
		for (int i = 0; i<tTiros; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>Circulos[cCirculos - 1].getRaio() || y>Circulos[cCirculos - 1].getRaio() || 
					x<Circulos[cCirculos - 1].getRaio()*(-1) || y<Circulos[cCirculos - 1].getRaio()*(-1)) {
				pontuacao +=0;
			} else {
				for(int j = 0; j<cCirculos; j++) {
//					int valorDoCirculo = 1;
					if(qtdCirculo == 0) {
						if(calcularXeYCirvulo(x, y) <= Math.pow(Circulos[qtdCirculo].getRaio(),2)) {
							pontuacao += (j+1);
							System.out.println("Eu sou desse circulo de raio " + Circulos[qtdCirculo].getRaio());
						}
					} else if(calcularXeYCirvulo(x, y) <= Math.pow(Circulos[qtdCirculo].getRaio(),2) && calcularXeYCirvulo(x, y) > Math.pow(Circulos[qtdCirculo-1].getRaio(),2)) {
						pontuacao += (j+1);
						System.out.println("Eu sou desse circulo de raio " + Circulos[qtdCirculo].getRaio());
						break;
					}
//					valorDoCirculo++;
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

/*
 Tiro ao alvo
Recentemente Juquinha ganhou de aniversário um joguinho bem clássico: Tiro ao Alvo. Ele arrumou um ótimo
lugar em seu quarto para se divertir com o jogo, porém após ler todas as regras do jogo ele percebeu que
precisa da sua ajuda para calcular a pontuação obtida. Segundo as regras, o alvo do jogo é composto por C
círculos, todos centrados na origem (0,0). Juquinha atira T vezes e após cada tiro informa suas coordenadas. A
pontuação de cada tiro é feita da seguinte forma: para cada círculo em que o tiro estiver contido Juquinha
recebe um ponto. Considere por exemplo a figura abaixo. O tiro marcado com a letra A recebe zero pontos,
pois não está contido por nenhum círculo. O tiro marcado com a letra B recebe um ponto, pois está contido
por um círculo (o mais externo). O tiro marcado com a letra C recebe dois pontos, pois está contido por dois
círculos (note que este caso mostra que tiros exatamente na borda de um círculo são considerados como
contidos pelo círculo). Já o tiro marcado com a letra D recebe três pontos, pois está contido pelos três círculos.
Considerando todos os pontos, a pontuação total de Juquinha é de 13 pontos.

Dados os raios de C círculos centrados na origem e as coordenadas dos T tiros realizados por Juquinha, escreva
um programa EM ASSEMBLY da arquitetura MIPS, que calcula o total de pontos que Juquinha obteve. Seu
programa deve executar com sucesso no simulador MARS. Utilize as syscalls do simulador para receber as
entradas e gerar a saída na tela.

Entrada
A primeira linha da entrada contém dois inteiros positivos, C e T, que representam,respectivamente, o número
de círculos do alvo e o número de tiros. Cada uma das C linhas seguintes contém um inteiro positivo. O i-ésimo
inteiro Ri representa o raio do i-ésimo círculo. Os raios Ri são fornecidos em ordem crescente. Cada uma das
T linhas seguintes contém um par X, Y de inteiros, que representam as coordenadas de cada tiro.

Saída
Seu programa deve imprimir uma única linha, contendo apenas um inteiro, o total de pontos obtidos por
Juquinha

 */
