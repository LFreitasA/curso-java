package oo.composicao.desafios;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> listaDeCompras = new ArrayList<>();
	Cliente cliente;
	
	Compra(Cliente cliente, Item item){
		
		System.out.println("A compra do item " + item.produto.nome + "foi realizada para o cliente " + cliente.nome);
		adicionarCompra(item);
		this.cliente = cliente;
	}
	
	void adicionarCompra( Item item){
		listaDeCompras.add(item);
	}
	
	double obterValorTotal () {
		double valorTotal =0;
		for(Item compr: listaDeCompras) {
			valorTotal+=compr.quantidade*compr.produto.preco;

			System.out.println(valorTotal);
		}
		return valorTotal;
	}
}
