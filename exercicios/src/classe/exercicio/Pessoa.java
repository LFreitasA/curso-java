package classe.exercicio;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		peso += comida.peso;
		System.out.println(nome + " esta omendo " + comida.nome);
	}
}
