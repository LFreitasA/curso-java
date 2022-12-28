package fundamentos;

import java.util.Scanner;

public class Wrappers {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	//byte
	Byte b = 100;
	Short s = 1000;
	Integer i = Integer.parseInt(teclado.next());
	Long l = 100000L;
	
	System.out.println(b.byteValue());
	System.out.println(s.toString());
	System.out.println(i.byteValue());
	System.out.println(l/3);
	
	Boolean bo = Boolean.parseBoolean("true");
	System.out.println(bo);
	
	System.out.println(bo.toString().toUpperCase());
	
	teclado.close();
	
	Character c = '#';
	System.out.println(c + "...");
	
	Float f =123.10F;
	System.out.println(f);
	
	Double d=1234.5678;
	System.out.println(d);
}



}
