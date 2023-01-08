package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Heroi heroi = new Heroi(10,14);
		Monstro monstro = new Monstro();
		
		//heroi.andar(Direcao.NORTE);
		//heroi.andar(Direcao.NORTE);
		//heroi.andar(Direcao.NORTE);
		//heroi.andar(Direcao.OESTE);
		
		heroi.x =10;
		heroi.y =14;
		monstro.x =10;
		monstro.y =15;
		
		System.out.println(heroi.atacar(monstro));
		System.out.println(monstro.atacar(heroi));
		heroi.curar();
		heroi.curar();
		monstro.danoCritico(monstro);
		
		
		System.out.println(heroi);
		System.out.println(monstro);
	}
}
