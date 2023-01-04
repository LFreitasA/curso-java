package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adcionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double getValorTotal() {
		double valorTotal = 0;
		
		for(Item item:itens) {
			valorTotal = valorTotal +(item.preco*item.quantidade);
		}
		
		return valorTotal;
		
	}
}
