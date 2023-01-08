package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA=velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if(velocidadeAtual+delta>VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
			return true;
		}else {
			velocidadeAtual += delta;
			return true;
		}
	}
	
	public boolean frear() {
		if(velocidadeAtual > 5) {
			velocidadeAtual-=5;
			
		}else {
			velocidadeAtual =0;
		}
		return true;
	}
}
