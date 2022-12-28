package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.12345678990; // explicita (CAST)
		System.out.println(b);

		int c = 130; 
		byte d = (byte )c;// explicita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f=(int) e;// explicita (CAST)
		System.out.println(f);
	}
}
