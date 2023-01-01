package controle.exercicios;

import java.util.Scanner;

public class Exercicio09 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int maiorNumero = 0;
	for(int i = 0; i<10; i++) {

		System.out.println("Escolha o numero");
		int numero = teclado.nextInt();
		maiorNumero = maiorNumero<numero ? numero : maiorNumero;
	}
	teclado.close();
	System.out.println("Maior numero = "+maiorNumero);

}
}
