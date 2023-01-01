package classe;

import classe.desafio.ClasseData01;

public class ValorVsReferencia {
public static void main(String[] args) {
	double a = 2;
	double b = a;
	
	a++;
	b--;
	System.out.println(a);
	System.out.println(b);
	
	ClasseData01 d1 = new ClasseData01();
	ClasseData01 d2 = d1; //Atribuição por referencia
	
	System.out.println(d1);
	System.out.println(d2);
}
}
