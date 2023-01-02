package arrays;

import java.util.Arrays;


public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(notasAlunoA);
		String alunoA = Arrays.toString(notasAlunoA);
		System.out.println(alunoA);

		double totalNotasAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalNotasAlunoA += notasAlunoA[i];

		}
		System.out.println("Media = " + totalNotasAlunoA / notasAlunoA.length);
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

		double totalNotasAlunoB=0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalNotasAlunoB += notasAlunoB[i];

		}
		System.out.println("Media = " + totalNotasAlunoB / notasAlunoB.length);
	}
}
