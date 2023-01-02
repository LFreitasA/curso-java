package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de alunos: ");
		int quantidadeAlunos = teclado.nextInt();
		System.out.print("Informe a quantidade de notas");
		int quantidadeNotas = teclado.nextInt();

		double[][] notas = new double[quantidadeAlunos][quantidadeNotas];


		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {

				notas[i][j] = teclado.nextDouble();

			}
		}

		teclado.close();
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				soma += notas[i][j];
			}

		}

		double media = soma / (quantidadeAlunos * quantidadeNotas);
		System.out.println(media);
	}

}
