package oo.heranca;

public class Monstro extends Jogador{
	public Monstro(){
		super(0,0);
	}
	
	public Monstro(int x, int y){
		super(x,y);
	}
	public void danoCritico(Jogador oponente) {
		oponente.vida -= (oponente.vida/2);
	}
}
