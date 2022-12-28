package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o primeiro salario");
	String salario1 = entrada.nextLine();
	salario1 = salario1.replace(",", ".");
	double salario1Convertido = Double.parseDouble(salario1);
	
	System.out.println("Digite o Segundo salario");
	String salario2 = entrada.nextLine();
	salario2 = salario2.replace(",", ".");
	double salario2Convertido = Double.parseDouble(salario2);
	
	System.out.println("Digite o Segundo salario");
	String salario3 = entrada.nextLine();
	salario3 = salario3.replace(",", ".");
	double salario3Convertido = Double.parseDouble(salario3);
	
	entrada.close();
	
	double somaSalarios = salario1Convertido + salario3Convertido +salario2Convertido;
	System.out.println("Soma dos 3 salarios = "+somaSalarios);
	
	double mediaSalarios = somaSalarios/3;
	System.out.println("Media salarios = "+mediaSalarios);
	
	
	
	
}
}


//pegar 3 strings

//salarios
/*
calcular media
com virgula e com ponto
soma os 3 
mostra a media
*/