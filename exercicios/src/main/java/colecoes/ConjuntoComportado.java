package colecoes;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//HashSet<String> conjunto = new HashSet<String>();
		
		//TreeSet ordena por ordem alfabetica
		TreeSet<String> conjunto = new TreeSet<String>();
		
		//inserindo itens:
		conjunto.add("Arthur");
		conjunto.add("Arthur"); // duplicado
		conjunto.add("Vinicius");
		conjunto.add("Carlos");
		conjunto.add("Bruno");
		
		for (String index : conjunto) {
			System.out.println(index);
		}
		
		int tamanho = conjunto.size();
		System.out.println("Tamanho: " + tamanho);
	}
}
