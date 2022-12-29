package controle;

import java.util.Scanner;

public class whileIndeterminado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto="";
		
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.println("Informe sair para sair");
			texto = teclado.nextLine();
		}
		teclado.close();
		System.out.println("Saiu");
	}
}
//Sair para sair