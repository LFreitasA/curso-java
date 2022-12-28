package fundamentos.exerciciosConclusaoCapitulo;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorLido = teclado.nextDouble();
		teclado.close();
		double valorQuadrado = Math.pow(valorLido, 2);
		double valorCubo = Math.pow(valorLido, 3);
		
		System.out.printf("O valor %f elevado ao Quadrado e : %f", valorLido, valorQuadrado);
		System.out.printf("\nO valor %f elevado ao Cubo e : %f", valorLido, valorCubo);
	}
}
