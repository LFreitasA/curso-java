package oo.composicao.desafios;

public class Produto {
	String nome;
	double preco;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		System.out.println("Produto " + nome + " criado com valor "+ preco);
	}

}
