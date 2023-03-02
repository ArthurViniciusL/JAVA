package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(1);
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add('t');
		conjunto.add("arthur");
		conjunto.add("arthur"); // duplicado

		int tamanho = conjunto.size();
		System.out.println("Tamanho: " + tamanho);

		System.out.println(conjunto.remove("teste"));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		// Unindo os dois conjuntos
		/*
		 * conjunto.addAll(nums); System.out.println(conjunto);
		 */

		// Selecionando os elementos em comum
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//Zerando o conjunto
		conjunto.clear();
		System.out.println(conjunto);

	}
}
