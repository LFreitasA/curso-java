package controle.exercicios;

import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
	int numero=0;
	int soma=0;
	Scanner teclado = new Scanner(System.in);
	while(numero>=0) {
		System.out.println("Informe o numero");
		 numero = teclado.nextInt();
		 if(numero>=0) {
			 soma +=numero;
			 System.out.println("Total = " + soma);
		 }else {
			 System.out.println("Saiu");
		 }
		
		
	}
	teclado.close();
	System.out.println("Total = " + soma);
}
}
