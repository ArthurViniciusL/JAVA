package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//add() e offer() -> adiconam na fila
		//Mas se afila estiver cheia...
		
		fila.add("Arthur"); //retorna um exception
		fila.offer("Vinicius"); //retorna false
		
		/* peek() e element() -> retornando o elemento;
		 * o primeiro elemento é o unico elemento retornado;
		 * Caso o elemeento nao exista... */		
		System.out.println("Elemento: " + fila.peek() 		); //retorna null
		System.out.println("Elemento: " + fila.element()	); //retorna um exception
		
		/*remove() -> remove o elemento primeiro elemento,
		 * caso nao tenha mais elementos é retornado um exception: */
		fila.remove();
		
		/* poll() -> remove e retorna o primeiro elemento,
		 * puxando o resto da fila;
		 * Caso nao tenha mais elementos é retornado null: */
		System.out.println("Elemento: " + fila.poll());
		System.out.println("Elemento: " + fila.poll());
		
		//Outros metodos
		System.out.println(	"Fila vazia? " 				+ fila.isEmpty()	);
		System.out.println(	"Qual o tamanho da fila? " 	+ fila.size()		);
		
		//Limpando a fila:
		fila.clear();
		
	}
}
