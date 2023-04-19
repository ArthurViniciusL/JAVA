package generics.chave_valor;

public class ParesTest {
	
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.addItem(1, "Arthur");
		
		System.out.println("Resultado: " + resultadoConcurso.getValor(1));
	}

}
