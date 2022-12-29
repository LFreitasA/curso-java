package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o dia da semana ");
		String diaDaSemana = teclado.nextLine().toLowerCase();
		teclado.close();

		if ("domingo".equals(diaDaSemana)) {
			System.out.println("1");
		} else if ("segunda".equals(diaDaSemana)) {
			System.out.println("2");
		} else if ("terça".equals(diaDaSemana)) {
			System.out.println("3");
		} else if ("quarta".equals(diaDaSemana)) {
			System.out.println("4");
		} else if ("quinta".equals(diaDaSemana)) {
			System.out.println("5");
		} else if ("sexta".equals(diaDaSemana)) {
			System.out.println("6");
		} else if ("sabado".equals(diaDaSemana)) {
			System.out.println("7");
		}
	}
}
