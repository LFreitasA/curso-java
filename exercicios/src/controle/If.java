package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a média");
		double media = teclado.nextDouble();

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 4) {
			System.out.println("Em Recuperacao");
		} else {
			System.out.println("Reprovado");
		}

		teclado.close();
	}
}
