package generics;

public class Caixa<TIPO_GENERICO> {
// geralmente se usa apenas letras para se definir classe genericas:
// public class Caixa<T> ou public class Caixa<G>
	
	
	private TIPO_GENERICO coisa;

	public TIPO_GENERICO getCoisa() {
		return coisa;
	}

	public void setCoisa(TIPO_GENERICO coisa) {
		this.coisa = coisa;
	}


}
