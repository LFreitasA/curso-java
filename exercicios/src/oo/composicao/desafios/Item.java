package oo.composicao.desafios;

public class Item {
	int quantidade;
	Produto produto;
	
	Item(int quantidade, Produto produto){
		this.quantidade = quantidade;
		this.produto = produto;
		System.out.println("item criado com o produto: "+ produto.nome + " preco: " +  produto.preco + " quantidade" + quantidade);
	}
}
