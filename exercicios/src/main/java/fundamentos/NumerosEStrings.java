package fundamentos;

public class NumerosEStrings {
	public static void main(String[] args) {
		Integer numero1 = 1000;
		String var1 = numero1.toString();
		System.out.println(var1);	
		//Eliminando uma variável:
		Integer numero2 = 1000;
		System.out.println( Integer.toString(numero2) );
		
		String numero3 = "8.2";
		double var2 = Double.parseDouble(numero3);
		System.out.println(var2);
	}
}