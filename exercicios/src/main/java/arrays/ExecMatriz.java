package arrays;
import java.util.Arrays;
public class ExecMatriz {

	public static void main(String[] args) {

		int linha = 3;
		int coluna = 3;
		
		double[] notas = new double[] { 9.0, 7.0, 8.3 };
		double[][] matriz = new double[linha][coluna];

		// Atribuindo e exibindo com o for()
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Atribuindo:
				matriz[i][j] = notas[j];
				System.out.printf("%d Aluno - Nota: %f.\n", i + 1, matriz[i][j]);
				//Neste caso tem a repetição dos valores de notas[];				
			}
		}
		
		//Apenas exibindo:
		for (double[] ds : matriz) {
			String exibe = Arrays.toString(ds);
			System.out.println(exibe);
		}
	}
}
