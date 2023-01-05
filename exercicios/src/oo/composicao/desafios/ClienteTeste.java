package oo.composicao.desafios;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Leonardo");

		Produto produto1 = new Produto("Portatil", 3500);
		Item item1 = new Item(2, produto1);
		Compra compra1 = new Compra(cliente1, item1);

		Produto produto2 = new Produto("camiseta", 39.90);
		Item item2 = new Item(10, produto2);
		compra1.adicionarCompra(item2);
		
		Produto produto3 = new Produto("Vara", 39.99);
		Item item3 = new Item(1, produto3);
		compra1.adicionarCompra(item3);
		
		System.out.println(compra1.cliente.nome);
		// Compra compra1 = new Compra(cliente1, )

		cliente1.obterValorTotal(compra1);

	}
}
