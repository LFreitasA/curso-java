package controle.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Informe a primeira nota");
double nota1 = teclado.nextDouble();
System.out.println("Informe a segunda nota");
double nota2 = teclado.nextDouble();
teclado.close();
double media = (nota1+nota2) / 2;

switch ((int )media ) {
case 10:
case 9:
case 8:
case 7:
System.out.println("Aprovado");
break;
case 6:
case 5:
case 4:
	System.out.println("Recuperacao");
	break;
default:
	System.out.println("Reprovado");

}
	}
}
