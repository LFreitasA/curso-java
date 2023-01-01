package classe.desafio;

public class ClasseData01 {
	int dia;
	int mes;
	int ano;

	ClasseData01(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public ClasseData01() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1,1,1970);
	}

	String obterDataFormatada() {
		String dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;

	}
}
