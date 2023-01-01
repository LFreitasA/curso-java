package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double primeiraNota = teclado.nextDouble();
		System.out.print("Informe a Segunda nota: ");
		double segundaNota = teclado.nextDouble();
		teclado.close();
		
		double media = (primeiraNota+segundaNota)/2;
		
		if(media>=7) {
			System.out.println("Aprovado");
		}else if(media>=4) {
			System.out.println("Em recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
	}
	

}
