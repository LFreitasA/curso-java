package classe.exercicio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Leonardo", 95.0);
		Pessoa p2 = new Pessoa("Bruna", 78.0);
		Comida c1 = new Comida("Arroz", 0.5);
		Comida c2 = new Comida("Feijao", 0.250);
		
		p1.comer(c1);
		p1.comer(c2);
		System.out.println(p1.peso);
		System.out.println(p2.peso);
	}
}
/*
 * Cria uma pessoa´ instanciar duas comidas comida fazer a pessoa comer comida
 * 
 * Pessoa nome e peso metodo comer recebe uma comida peso da comida soma ao peso
 * da pessoa
 * 
 * Comida nome e peso
 * 
 */
