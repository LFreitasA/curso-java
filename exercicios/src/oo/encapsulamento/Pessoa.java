package oo.encapsulamento;

public class Pessoa {
	private int idade;
	
	Pessoa(int idade){
		setIdade(idade);
	}
	//getter
	public int getIdade() {
		return idade;
	}
	
	//setter
	public void setIdade(int idade) {
		if(idade>=0 && idade<=130) {
			this.idade = idade;			
		}
	}
}
