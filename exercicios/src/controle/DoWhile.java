package controle;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String texto = "";
	
	do {
		System.out.println("Voce precisa escrever sair");
		texto = teclado.nextLine();
		
	}while(!texto.equalsIgnoreCase("sair"));
	System.out.println("Saiu");
	teclado.close();
}
}
