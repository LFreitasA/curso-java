package classe.desafio;

public class ClasseData01 {
	int dia;
	int mes;
	int ano;

	ClasseData01(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	ClasseData01() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	String obterDataFormatada() {
		String dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;

	}
}
