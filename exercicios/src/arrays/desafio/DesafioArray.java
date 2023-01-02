package arrays.desafio;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double soma = 0;
		System.out.print("Informe a quantidade de notas: ");
		int quantidadeNotas = teclado.nextInt();
		double[] notas = new double[quantidadeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1));
			notas[i] = teclado.nextDouble();
		}
		teclado.close();

		for (double nota : notas) {
			soma += nota;
		}

		System.out.println("Média = " + soma / notas.length);

	}
}
