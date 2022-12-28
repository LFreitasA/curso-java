package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		System.out.println("Converter temperatura de entrada de x Para y");
		int fahrenheit = 35;
		final int ajuste = 32;
		final double fator = 5/9.0;
		double celsius = (fahrenheit-ajuste)*fator;
		System.out.println("A temperatura "+ fahrenheit + " em celcius e " + celsius);
	}
}
