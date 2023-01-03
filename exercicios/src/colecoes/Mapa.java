package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Leonardo");
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(5));
		System.out.println(usuarios.remove(1, "teste"));
		System.out.println(usuarios.get(1));

		for(int chave:usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String value:usuarios.values()) {
			System.out.println(value);
		}
		
		for(Entry<Integer, String> value:usuarios.entrySet()) {
			System.out.println(value.getKey());
			System.out.println(value.getValue());
			System.out.println(value);
		}
	}
}
