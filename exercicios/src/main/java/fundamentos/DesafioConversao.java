package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		//double[] salarios = new double[3];
		ArrayList<Double> salarios = new ArrayList<Double>();
		
		Scanner entrada = new Scanner(System.in);
		int c = 1;
		while (c < 4) {			
			System.out.printf("Informe o %d ª slário: " ,c);
			String salario = entrada.nextLine().replace(",", ".");
			//salarios[c] = Double.parseDouble(salario);
			salarios.add(Double.parseDouble(salario));
			c += 1;
		}
		entrada.close();
		
		//double media = (salarios[0] + salarios[1] + salarios[2]) /3;
		double media = (salarios.get(0) + salarios.get(1) + salarios.get(2)) /3;
		System.out.printf("Média de salários: R$%.2f" ,media);
	}
}