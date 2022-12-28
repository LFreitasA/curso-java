package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcomulados = 3_234_845_223L;
		
		float salario = 11_445.44F;
		double vendasAcomuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = true;
		
		char status = 'A';
		
		//diasDeEmpresa 
		System.out.println(anosDeEmpresa*365);
		//numero de viagens
		System.out.println(numeroDeVoos/2);
		//pontos por real
		System.out.println(pontosAcomulados/vendasAcomuladas);
		
		//Salario
		System.out.println(id + ": ganha ->  "+ salario);
		
		//Ferias
		System.out.println("Ferias ? "+ estaDeFerias);
		
		//status
		System.out.println("Status: "+status);
	}
}

/*
 * 8 tipos
 * 6 tipos valores numericos
 * INTEIROS
 * byte 1
 * short 2
 * int 4
 * long 8
 * 
 * racionais
 * float 4
  * double 8
  * 
  * letras
  * char
  * boolean
*/