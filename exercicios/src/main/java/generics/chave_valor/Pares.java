package generics.chave_valor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
	
	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void addItem(C chave, V valor) throws IllegalArgumentException {
		//Sendo a chave igual a null, saia do metodo
		//if (chave == null) return;
		
		if(chave == null) {
			throw new IllegalArgumentException("A chave não pode ser null...");
		}
		
		itens.add(new Par<C,V>(chave, valor));
		
		Par<C,V> novoPar = new Par<C,V>(chave,valor);
		
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if (chave == null) { 
			return null; 
		}
		V valor = null;
		Optional<Par<C,V>> parOpcional = itens.stream()
												.filter(par -> chave.equals(par.getChave()))
												.findFirst();
		if (parOpcional.isPresent()) {
			valor = parOpcional.get().getValor();
			
		}
		return valor;
	}
	
	
}
