package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	HashSet conjunto = new HashSet();
	HashSet conjunto2 = new HashSet();
	
	conjunto.add(1.2);
	conjunto.add(true);
	conjunto.add("Teste");
	conjunto.add(1);
	conjunto.add("x");
	
	conjunto2.add(1.2);
	conjunto2.add(true);
	conjunto2.add("Teste");
	conjunto2.add(1);
	conjunto2.add("x");
	System.out.println("Tamanho e " +conjunto.size());
	
	conjunto.add("Teste");
	System.out.println("Tamanho e " +conjunto.size());
	
	System.out.println(conjunto.remove("Teste"));
	System.out.println(conjunto.remove("x"));
	
	System.out.println(conjunto.contains("x"));
	System.out.println(conjunto.contains(1));
	System.out.println(conjunto.contains(true));
	
	Set nums = new HashSet();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	System.out.println(nums);
	
	conjunto.addAll(nums);
	System.out.println(conjunto);
	
	conjunto2.retainAll(nums); //uniao entre dois conjuntos mantendo os iguais
	System.out.println(conjunto2);
	
	conjunto2.clear(); //limpa o conjunto
	System.out.println(conjunto2);
	
}
}
