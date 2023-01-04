package oo.composicao;

public class Carro {
	Motor motor = new Motor();

	void acelerar() {
		if (motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		} else {
			System.out.println("O carro morreu");
			motor.ligado = false;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
