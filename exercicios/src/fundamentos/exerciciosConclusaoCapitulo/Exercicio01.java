package fundamentos.exerciciosConclusaoCapitulo;

public class Exercicio01 {
	public static void main(String[] args) {
		int celsius = 6;
		double fahrenheit = (celsius * 9.0 / 5) + 32;

		System.out.printf("A temperatura %d celcius em Fahrenheit e %.2f", celsius, fahrenheit);
	}
}

/*
 * Criar um programa que leia a temperatura em Fahrenheit e converta para
 * Celsius. (0 °C × 9/5) + 32 = 32 °F
 */
