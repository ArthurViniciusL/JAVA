package arrays;

import java.util.Scanner;

public class MediaDasNotas {

	public static void main(String[] args) {
		Scanner scInputJv = new Scanner(System.in);
		
		System.out.print("Informe quatas notas deseja inserir: ");
		String inputJv = scInputJv.nextLine();
		
		int tamanho = Integer.valueOf(inputJv);
		double[] arrayNotas = new double[tamanho];
		double somaNotas = 0;
		double mediaAluno = 0;
		
		for (int i = 0; i < arrayNotas.length; i++) {
			System.out.printf("Informe a %dª Nota: ", i +1);
			inputJv = scInputJv.nextLine();
			
			double notaAluno = Integer.valueOf(inputJv);
			arrayNotas[i] = notaAluno;
		}
		
		for (double d : arrayNotas) {
			somaNotas += d;
		}
		
		mediaAluno = (somaNotas/arrayNotas.length);
		
		System.out.println("Ok, processando médias...");
		
		//Faz um pequeno intervalo de execução:
		try {
			Thread.sleep(1000);			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.printf("mediaAluno do aluno: %.2f.", mediaAluno);
		
	}

}
