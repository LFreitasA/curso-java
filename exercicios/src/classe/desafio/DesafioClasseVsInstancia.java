package classe.desafio;

public class DesafioClasseVsInstancia {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	DesafioClasseVsInstancia(String nome,double preco){
		this.nome = nome;
		this.preco=preco;
	}
	
	double PrecoFinal() {
		return preco * (1-desconto);
	}
}
