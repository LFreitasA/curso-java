package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		double preco = 4356.89;
		double desconto = 0.25;
		Produto produto1 = new Produto("Notebook", preco, desconto);
		// produto1.nome = "Notebook";
		// double precoFinal1 = produto1.preco * (1.0-produto1.desconto);

		Produto produto2 = new Produto();
		produto2.nome = "Caneta preta";
		produto2.preco = 12.56;
		produto2.desconto = 0.26;
		// double precoFinal2 = produto2.preco * (1.0-produto2.desconto);

		double precoF1 = produto1.precoComDesconto();
		System.out.println(precoF1);

		double precoF2 = produto2.precoComDesconto();
		System.out.println(precoF2);

		System.out.println();
	}
}
