package lambdas;

import java.util.function.Function;

public class Funcao {
public static void main(String[] args) {
	Function<Integer, String> parOuImpar = numero -> numero%2 == 0 ? "Par" : "Impar";
	
	System.out.println(parOuImpar.apply(33));
	System.out.println(parOuImpar.apply(32));
	
	Function<String , String> oResultadoE = valor -> "O resultado e: " + valor;
	
	String resultadoFinal = parOuImpar.apply(33);
	System.out.println(resultadoFinal);
	System.out.println(oResultadoE.apply(resultadoFinal));
	
	 resultadoFinal = parOuImpar.apply(32);
	System.out.println(resultadoFinal);
	System.out.println(oResultadoE.apply(resultadoFinal));
	
	Function<String, String> empolgado = valor -> valor + "!!!";
	
	String novo = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
	System.out.println(novo);
	
	System.out.println(empolgado.apply(novo));
}
}
