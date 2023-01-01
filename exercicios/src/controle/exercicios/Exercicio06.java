package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Random random = new Random();
		int numero = random.nextInt(100);
		Scanner teclado = new Scanner(System.in);

		int quantidade = 10;
		boolean venceu = false;
		while(quantidade!=0) {
			System.out.println("Informe o numero");
			int numeroEscolhido = teclado.nextInt();

			if(numeroEscolhido>numero) {
				quantidade --;
				System.out.println("O numero eh maior que o numero escolhido, restam " + quantidade + " tentativas");
			}else if(numeroEscolhido<numero) {
				quantidade --;
				System.out.println("O numero eh menor que o numero escolhido, restam " + quantidade + " tentativas");
			}else {
				quantidade =0;
				venceu = true;
			}
		
		}
		teclado.close();
		String mensagem = venceu ? "Parabens voce venceu!!!!!" : "Voce perdeu!!";
		System.out.println(mensagem);
		
	}
}
