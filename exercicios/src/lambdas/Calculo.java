package lambdas;

@FunctionalInterface
public interface Calculo {
	public double exercutar(double a, double b);
	
	default String legal () {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
