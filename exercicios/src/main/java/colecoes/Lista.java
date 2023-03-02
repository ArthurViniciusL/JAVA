package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// ArrayList<tipo>
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		//Usuario vindo por colecao
		
		//Adiciona elemetno
		Usuario u1 = new Usuario("Arthur");
		lista.add(u1);
		//ou
		lista.add(new Usuario("Vinicius"));
		
		//Remove elemento
		/*lista.remove(0);
		lista.remove(u1);*/
		
		System.out.println("Elementos:");
		for (Usuario usuario : lista) {
			System.out.println(	usuario.getNome()	);
		}
		
		System.out.println(	"\nTamanho: " 		+ lista.size()				);
		System.out.println(	"Vazio? " 			+ lista.isEmpty()			);
		System.out.println("Existe na lista? " 	+ lista.contains(u1)		);
		System.out.println(	"Posi. Elemento: " 	+ lista.indexOf(u1)			);
		System.out.println(	"Elementod do Indice : " 	+ lista.get(0).getNome()	);
		System.out.println(	"toString personalizado : " + lista.get(0).toString()	);
		//Terá um erro, pois esse indice nao existe:
		//System.out.println(	"Vazio? " 			+ lista.get(3).getNome());
	}
}
