package colecoes;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConjuntoComportado {
public static void main(String[] args) {
//	Set<String> lista = new HashSet<String>();
	Set<String> lista = new TreeSet<String>();
	lista.add("Ana");
	lista.add("Calos");
	lista.add("Luca");
	lista.add("Pedro");
	
	
	for(String candidato: lista) {
		System.out.println(candidato);
	}
	
	Set<Integer> nums = new TreeSet<Integer>();
	nums.add(1);
	nums.add(2);
	nums.add(120);
	nums.add(6);

	for(int n: nums){
		System.out.println(n+10);
	}
		
	}
}

