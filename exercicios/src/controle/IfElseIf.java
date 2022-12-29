package controle;

import java.util.Scanner;

public class IfElseIf {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a nota");
	double nota = teclado.nextDouble();
	teclado.close();
	
	if(nota>10 || nota<0) {
		System.out.println("nota invalida");
	}else if(nota>=8.1) {
		System.out.println("Conceito A");
		System.out.println("Parabens");
	}else if(nota>=6.1) {
		System.out.println("Conceito B");
	}else if(nota>=4.1) {
		System.out.println("Conceito C");
	}else if(nota >=2.1) {
		System.out.println("Condeito D");
	}else {
		System.out.println("Conceito F");
	}
	System.out.println("Fim");
	
	
}
}
