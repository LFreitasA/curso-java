package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	Produto(String nomeInicial, double precoInicial, double desconto){
		nome = nomeInicial;
		preco = precoInicial;
		this.desconto = desconto;
	}
	
	Produto(){
		
	}
	
	double precoComDesconto () {
		double precoFinal = preco * (1.0-desconto);
		return precoFinal;
	}
}
