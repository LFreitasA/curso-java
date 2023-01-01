package controle.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		teclado.close();
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}
}
