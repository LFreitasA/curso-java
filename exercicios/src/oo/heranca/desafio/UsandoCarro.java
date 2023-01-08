package oo.heranca.desafio;

public class UsandoCarro {
	public static void main(String[] args) {
		Civic carro1 = new Civic();
		carro1.velocidadeAtual=1;
		carro1.acelerar();
		System.out.println(carro1.velocidadeAtual);
		carro1.frear();
		System.out.println(carro1.velocidadeAtual);
		carro1.frear();
		System.out.println(carro1.velocidadeAtual);
		carro1.frear();
		System.out.println(carro1.velocidadeAtual);
		
		Ferrari carro2 = new Ferrari();
		carro2.velocidadeAtual=1;
		carro2.acelerar();
		System.out.println(carro2.velocidadeAtual);
		carro2.frear();
		System.out.println(carro2.velocidadeAtual);
		carro2.frear();
		System.out.println(carro2.velocidadeAtual);
		carro2.frear();
		System.out.println(carro2.velocidadeAtual);
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		System.out.println(carro2.velocidadeAtual);
	}
}
