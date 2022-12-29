package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double controlador =0;
		int contador=0;
		double totalNotas=0; 
		
		while(controlador!=-1.0) {
			System.out.println("Informe a nota ou digite -1 para sair");
			controlador = teclado.nextDouble();
			
			if(controlador>=0 && controlador<=10) {
				totalNotas+=controlador;
				System.out.println(totalNotas);
				contador++;
			}
		}
		teclado.close();
		
		System.out.println("saiu");
		double media = totalNotas/contador;
		System.out.println("Media = " + media);
	}
}
/*
 * Digitar a nota
 * nota deve ser entre 0 e 10
 * nota é incrementada conforme as notas dos usuarios
 * ter contador de notas
 * 
 * mostra e media
 * 
 * sair com valor -1
 */
