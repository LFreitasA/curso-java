package oo.composicao.desafios;

public class Cliente {
	String nome;
	Compra listaDeCompras;
	
	Cliente(String nome){
		this.nome = nome;
		System.out.println("Cliente " + nome + " criado");
	}
	
	void obterValorTotal (Compra compra) {
		double valorTotal =0;
		for(Item compr: compra.listaDeCompras) {
			valorTotal+=compr.quantidade*compr.produto.preco;

			System.out.println(valorTotal);
		}

	}
}
