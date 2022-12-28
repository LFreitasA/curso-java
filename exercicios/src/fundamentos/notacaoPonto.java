package fundamentos;

public class notacaoPonto {
public static void main(String[] args) {
	double a = 2.3;
	String texto = "Bom dia X";
	
	System.out.println(a);
	texto = texto.replace("X", "Senhora");
	texto = texto.toUpperCase();
	texto = texto.concat("!!!!");
	System.out.println(texto);
}
}
