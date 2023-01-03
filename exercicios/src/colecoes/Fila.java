package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		
		//peek e element retornam o proximo elemento da fila sem remover
	
		System.out.println(fila.peek());
		System.out.println(fila.peek()); //retorna null quando a lista esta vazia
		System.out.println(fila.element()); //retorna exceção quando a lista esta vazia
		
		
		//fila.clear();
		//fila.size();
		//fila.isEmpty();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());//remove o elemento da fila - caso vazio retorna null
		System.out.println(fila.remove());//remove o elemento da fila - caso vazio retorna exceção
		
	}
}
