package oo.encapsulamento;

public class PessoaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa(-30);
	//p1.idade = -30;
	System.out.println(p1.getIdade());
	p1.setIdade(33);
	System.out.println(p1.getIdade());
	p1.setIdade(45);
	System.out.println(p1.getIdade());
}
}
