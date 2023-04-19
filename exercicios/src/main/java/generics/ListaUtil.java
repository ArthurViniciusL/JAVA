package generics;

import java.util.List;

public class ListaUtil {
	
	//Com Object
	public static Object getUltimo1(List<?> lista) {
		Object ultimoElemento = lista.get(lista.size() - 1);
		return ultimoElemento;		
	}
	
	//Com generics		
	public static <T> T getUltimo2(List<T> lista) {
		T ultimoElemento = lista.get(lista.size() - 1);
		return ultimoElemento;		
	}
}
