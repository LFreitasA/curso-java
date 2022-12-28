package fundamentos.exerciciosConclusaoCapitulo;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe seu peso: ");
		double peso = teclado.nextDouble();
		
		System.out.println("Informe sua altura");
		double altura = teclado.nextDouble();		
		teclado.close();
		
		double imc = peso / Math.pow(altura, 2);
		System.out.printf("Seu IMC = %f", imc);
	}
}

/*
 * Criar um programa que leia o peso e a altura do usuário e imprima no console
 * o IMC.
 */
