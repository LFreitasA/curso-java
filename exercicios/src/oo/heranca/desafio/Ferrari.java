package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	boolean arCondicionado=false;
	public Ferrari(){
		super(380);
		setDelta(15);
	}
	//@Override
	/*boolean acelerar() {
		
			if(velocidadeAtual+60>VELOCIDADE_MAXIMA) {
				velocidadeAtual=VELOCIDADE_MAXIMA;
				return true;
			}else {
				velocidadeAtual += 60;
				return true;
			}
		}*/

	@Override
	public void ligarTurbo() {
		setDelta(55);
		
	}

	@Override
	public void desligarTurbo() {
		setDelta(15);
		
	}

	@Override
	public void ligarAr() {
		arCondicionado = true;
	}

	@Override
	public void desligarAr() {
		arCondicionado=false;
	}
	
}
