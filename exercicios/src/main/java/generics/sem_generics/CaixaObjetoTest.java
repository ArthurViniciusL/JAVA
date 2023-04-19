package generics.sem_generics;

public class CaixaObjetoTest {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.setCoisa(2.3);
		
		Double algumaCoisaA =  (Double) caixaA.getCoisa();
		System.out.println(algumaCoisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaA.setCoisa("Olá");
		
		String algumaCoisaB =  (String) caixaB.getCoisa();
		System.out.println(algumaCoisaB);
	}
}
