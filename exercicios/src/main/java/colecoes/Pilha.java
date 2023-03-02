package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		//Adicionando:
		//retorna um valor booleano;
		livros.add("Conan Vol. 3");
		 //retorna um exception
		livros.push("O hobbit");
		
		//Obtendo:
		//retorna um valor null se o elemento nao existir;
		System.out.println(livros.peek());
		//retorna um exception se o elemento nao existir
		System.out.println(livros.element());
		
		//Obtendo e Removendo:
		//retorna null se nao existir elementos
		livros.poll();
		//retorna um exception se nao existir elementos
		livros.pop();
		//retorna um exception se nao existir elementos
		livros.remove();
		
		//Outros metodos:
		livros.contains("O hobbit"); //verifica se um elemento existe;
		livros.size();
		livros.clear();
	}
}
