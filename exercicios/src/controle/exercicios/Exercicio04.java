package controle.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero");
		int numero = teclado.nextInt();
		teclado.close();
		int contador = 0;

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				contador++;
			}

		}

		if (contador <= 2) {
			System.out.println("Numero primo");
		} else {
			System.out.println("Nao e primo");
		}
	}
}
