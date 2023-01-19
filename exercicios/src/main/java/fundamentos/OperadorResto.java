package fundamentos;

public class OperadorResto {
	public static void main(String[] args) {
		
		int numero = 4;
		float resto = numero % 2;
		System.out.println(resto);
		if (resto <= 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
	}
}
