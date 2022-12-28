package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
 double media = 3.9;
 String resultado = media>=7.0 ? "aprovado":
	 media<4 ? "Reprovado" : "Recuperacao";
 System.out.println("O aluno esta " + resultado);
	}
}
