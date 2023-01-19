package fundamentos;

public class Circunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; //constante;
		double area = PI * (Math.pow(raio, 2));
		System.out.println(area);
	}
}