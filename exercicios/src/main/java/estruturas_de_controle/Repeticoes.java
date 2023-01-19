package estruturas_de_controle;

public class Repeticoes {
	public static void main(String[] args) {
		
		int contador = 0;
		while (contador < 10) { //usado para repetições indefinidas.
			System.out.println("9 iterações");
			contador++; //=+ 1
		}
		
		//usado para repetições com tamanho definido.
		for (int i = 0; i < contador; i++) {
			System.out.println("9 iterações também");
		}
		
		do { //usado para repetições indefinidas.
			System.out.println("9 iterações de novo");
			contador++;
		} while (contador < 10);
	}
}

