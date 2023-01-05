package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Joao Pedro";

		c1.adcionarItem(new Item("caneta", 20, 7.45));
		c1.adcionarItem(new Item("Borracha", 12, 3.89));
		c1.adcionarItem(new Item("Caderno", 3, 18.79));

		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
		

	}
}
