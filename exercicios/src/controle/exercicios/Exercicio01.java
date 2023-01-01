package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int numero = teclado.nextInt();
		teclado.close();
		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
			System.out.println("numero par entre 0 e 10");
		} else {
			System.out.println("Numero invalido");
		}
	}
}
