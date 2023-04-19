package generics;

public class CaixaTest {
	
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.setCoisa("Segredo...");
		String coisaA = caixaA.getCoisa();
		System.out.println(coisaA);		
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.setCoisa(2.4762);
		
		double coisaB = caixaB.getCoisa();
		System.out.println(coisaB);		
	}

}
