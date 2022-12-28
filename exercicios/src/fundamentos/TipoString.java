package fundamentos;

public class TipoString {
public static void main(String[] args) {
	System.out.println("Olá pessoal".charAt(0));
	
	String s = "Boa tarde";
	System.out.println(s.concat(s)); //concatena Strings 
	System.out.println(s.startsWith("B")); //retorna um bool
	System.out.println(s.length());
	System.out.println(s.endsWith("e"));//retorna um bool
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));
	
	var nome ="pedro";
	var sobrenome = "Santos";
	var idade = 33;
	var salario = 12345.6789;
	System.out.println("Nome: "+ nome + "\nSobrenome: "+ sobrenome + "\nIdade: "+ idade + "\nSalario: " + salario );
	
	System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.ss", nome, sobrenome, idade, salario);
	
	String frase = String.format("\n\nNome: %s %s tem %d anos e ganha R$%.2f....", nome, sobrenome, idade, salario);
	System.out.println(frase);
	
	System.out.println("Frase qualquer".contains("qual"));
	System.out.println("Frase qualquer".indexOf("qual"));
	System.out.println("Frase qualquer".substring(6));
	System.out.println("Frase qualquer".substring(6, 8));
}
}
