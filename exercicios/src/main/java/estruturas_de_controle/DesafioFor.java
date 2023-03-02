package estruturas_de_controle;

public class DesafioFor {
	public static void main(String[] args) {

		for (String s = "#"; ! s.equals("######"); s += "#") {
			System.err.println(s);
		}
	}
}
