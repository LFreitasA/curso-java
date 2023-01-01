package classe.desafio;

public class ClasseData01Teste {
	public static void main(String[] args) {
		ClasseData01 data1 = new ClasseData01();
//		data1.dia = 22;
//		data1.mes = 5;
//		data1.ano = 1989;
		
		
		int dia = 9;
		int mes = 8;
		int ano = 1989;
		ClasseData01 data2 = new ClasseData01(dia,mes, ano);
		
		
		ClasseData01 data3 = new ClasseData01();
		data3.dia = 23;
		data3.mes = 3;
		data3.ano = 2015;
		
		System.out.println(data1.dia + "/" + data1.mes + "/"+ data1.ano);
		System.out.println(data2.dia + "/" + data2.mes + "/"+ data2.ano);
		System.out.println(data3.dia + "/" + data3.mes + "/"+ data3.ano);
		
		System.out.println("Data pela classe");

		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		System.out.println(data3.obterDataFormatada());
	}
}
