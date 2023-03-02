package arrays;
import java.util.Arrays;
public class ExecArray {
    public static void main(String[] args) {

        double[] notas = new double[]{9.0, 7.0, 8.3};

        double[] notasAlunoA = new double[3];

        //Atribuindo e exibindo com um for()
        for (int i = 0; i < notasAlunoA.length; i++) {
            notasAlunoA[i] = notas[i];
            System.out.printf("Notas do Aluno: %dª - %f.\n", i + 1, notasAlunoA[i]);

        }
        //Exibindo com um toString();
        String exibe = Arrays.toString(notasAlunoA);
        System.out.println(exibe);

        //Foreach:
        for (double exibindo : notasAlunoA) {
            System.out.println(exibindo);
        }
    }
}
