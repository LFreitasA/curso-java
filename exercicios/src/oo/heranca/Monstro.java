package oo.heranca;

public class Monstro extends Jogador{
	Monstro(){
		super(0,0);
	}
	
	Monstro(int x, int y){
		super(x,y);
	}
	void danoCritico(Jogador oponente) {
		oponente.vida -= (oponente.vida/2);
	}
}
