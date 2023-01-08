package oo.composicao.desafios;

public class Cliente {
	String nome;
	Compra listaDeCompras;

	Cliente(String nome) {
		this.nome = nome;
		System.out.println("Cliente " + nome + " criado");
	}
}
