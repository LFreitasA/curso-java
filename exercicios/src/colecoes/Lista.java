package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<ListaUsuario> lista = new ArrayList<>();
		ListaUsuario u1 = new ListaUsuario("Ana");
		lista.add(u1);
		
		lista.add(new ListaUsuario("Carlos"));
		lista.add(new ListaUsuario("Lia"));
		lista.add(new ListaUsuario("Bia"));
		lista.add(new ListaUsuario("Manu"));

		System.out.println("Tem? "+lista.contains(new ListaUsuario("Lia")));
		
		System.out.println(lista.get(3).nome); //pega o dado da posicao indicada
		
		lista.remove(1);
		System.out.println(lista.remove(new ListaUsuario("Manu")));
		
		for(ListaUsuario u: lista) {
			System.out.println(u);
		}
		
		
		
	}
}
