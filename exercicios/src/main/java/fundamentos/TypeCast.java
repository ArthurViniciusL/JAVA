package fundamentos;

public class TypeCast {
	public static void main(String[] args) {
		int numero1 = 1;
		//Conversão possível:
		double var1 = numero1;
		//TypeCast:
		float var2 = (float) var1;
		
		System.out.println(var2);
	}
}

