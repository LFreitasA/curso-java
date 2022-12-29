package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a nota ");
		double nota = teclado.nextDouble();
		teclado.close();

		switch ((int) nota) {
		case 10:
		case 9:
			conceito = "A";
			break;

		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "C";
			break;
		default:
			conceito = "não encontrado";
			break;
		}

		System.out.printf("Conceito %s", conceito);
	}
}
