package generics.com_heranca;

public class CaixaIntTest {
	
	public static void main(String[] args) {
		CaixaInt caixaA = new CaixaInt();
		caixaA.setCoisa(123);
		
		int coisaA = caixaA.getCoisa();
		System.out.println(coisaA);
		
	}
	

}
