package estruturas_de_controle;

public class SwitchCase {
	public static void main(String[] args) {
		
		double nota1 = 10;
		double nota2 = 7.4;
		int media = (int) (nota1 + nota2)/2;
		
		
		switch (media) {
		case 10: case 9:
			System.out.println("Mandou bem!");
			break;
		
		case 8:
		case 7:
			System.out.println("Quase ein");
			break;
		case 6:
			System.out.println("Não deu");
			break;
		}
	}
}

