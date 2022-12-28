package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
public static void main(String[] args) {
/*
 * Ler num1
 * Ler num2
 * Receber o operador + - * / %
 * mostrar resultado
 */
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe o primeiro numero: ");
	String num1 = teclado.nextLine();
	double valor1 = Double.parseDouble(num1);
	
	System.out.print("Informe o Segundo numero numero: ");
	String num2 = teclado.nextLine();
	double valor2 = Double.parseDouble(num2);
	
	System.out.print("Informe o operador: ");
	String operador = teclado.nextLine();
	teclado.close();
	
	
	double resultado = operador.equals("+") ? valor1 + valor2 : 
		operador.equals("-") ? valor1 - valor2 : 
		operador.equals("*") ? valor1 * valor2 :
		operador.equals("/") ? valor1 / valor2 :
		operador.equals("%") ? valor1 % valor2 : null;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(operador);
	
	System.out.println("O resultado de " + num1 + " "+ operador + " " + num2 + " = " + resultado);
}
}
