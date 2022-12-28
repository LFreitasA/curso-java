package desafios;

public class desafioOperadoresAritimeticos {
public static void main(String[] args) {

	int valor1Soma = 3+2;
	int valor2Multiplicacao = 6*valor1Soma;
	double valor3ElevarAoQuadrado = Math.pow(valor2Multiplicacao, 2);
	int valor4Multiplicacao = 3*2;
	
	double valor5PrimeiraConta = valor3ElevarAoQuadrado/valor4Multiplicacao;
	System.out.println(valor5PrimeiraConta);
	
	int valor6Subtracao = 1-5;
	int valor7Subtracao = 2-7;
	int valor8Multiplicacao = valor6Subtracao * valor7Subtracao;
	int valor9Divisao = valor8Multiplicacao/2;
	double valor10ElevadoAoQuadrado = Math.pow(valor9Divisao, 2);
	System.out.println(valor10ElevadoAoQuadrado);
	
	
	double valor11Subtracao = valor5PrimeiraConta - valor10ElevadoAoQuadrado;
	double valor12ElevarAoCubo = Math.pow(valor11Subtracao, 3);
	double valor13ExpoenteElevadoAOCubo =Math.pow(10, 3);
	double resultado = valor12ElevarAoCubo/valor13ExpoenteElevadoAOCubo;
	System.out.println((int )resultado);
	
	
}
}
