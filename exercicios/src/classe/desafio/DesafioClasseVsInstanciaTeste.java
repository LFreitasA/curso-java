package classe.desafio;

public class DesafioClasseVsInstanciaTeste {
	public static void main(String[] args) {
		DesafioClasseVsInstancia produto1 = new DesafioClasseVsInstancia("notebook", 1000);
		System.out.println(produto1.nome + " " + produto1.PrecoFinal());
		System.out.println();
	}
}
