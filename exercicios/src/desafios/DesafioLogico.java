package desafios;

public class DesafioLogico {
public static void main(String[] args) {
	// trabalho na terça (V ou F)
	// trabalho na quinta (V ou F)
	boolean trabalho1 = false;
	boolean trabalho2 = false;

	boolean comprarTV55 = trabalho1 && trabalho2;
	boolean comprarTV32 = (trabalho1 || trabalho2) && !comprarTV55 ;
	boolean tomarSorve = trabalho1 ||trabalho2;
	System.out.println("Comprar TV55 = " + comprarTV55);
	System.out.println("Comprar TV32 = "+ comprarTV32);
	System.out.println("Tomar Sorvete = "+ tomarSorve);
}
	

	
}
