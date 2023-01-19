package arrays;

import java.util.Scanner;
import java.util.Locale;

public class MatrizDeNotas {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner scInputJv = new Scanner(System.in);

		System.out.print("Informe quatas notas deseja inserir: ");
		String inputTotAlunos = scInputJv.nextLine();
		System.out.print("Informe quatas notas deseja inserir: ");
		String inputTotNotas = scInputJv.nextLine();
		
		System.out.println("------------------------------");
		
		int totAlunos = Integer.valueOf(inputTotAlunos);
		int totNotas = Integer.valueOf(inputTotNotas);
		double[][] matrizNotas = new double[totAlunos][totAlunos];
		
		double somaNotas = 0;
		double mediaDaTurma = 0;
		
		for (int i = 0; i < matrizNotas.length; i++) {
			for (int j = 0; j < matrizNotas[i].length; j++) {
				System.out.printf("Informe a %dª do Aluno %d: ", j+1, i+1);
				double inputNota = scInputJv.nextDouble();
				
				matrizNotas[i][j] = inputNota;
				somaNotas += matrizNotas[i][j];
			}
			
			System.out.println("------------------------------");
		}
		mediaDaTurma = somaNotas /(totAlunos * totNotas);
		System.out.printf("Média da Turma: %.2f.", mediaDaTurma);
	}

}
