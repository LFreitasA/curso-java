package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA=velocidadeMaxima;
	}
	
	boolean acelerar() {
		if(velocidadeAtual+delta>VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
			return true;
		}else {
			velocidadeAtual += delta;
			return true;
		}
	}
	
	boolean frear() {
		if(velocidadeAtual > 5) {
			velocidadeAtual-=5;
			
		}else {
			velocidadeAtual =0;
		}
		return true;
	}
}
