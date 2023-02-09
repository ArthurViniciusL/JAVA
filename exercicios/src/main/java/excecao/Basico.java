package excecao;
public class Basico {
    public static void main(String[] args) {

        //Situacao de erro 01
        Aluno aluno1 = null;

        try {
            imprimirNomeDoAluno(aluno1);
        } catch (Exception e) {
            System.out.println("O valor do aluno não pode ser nulo");
        }

        //Situacao de erro 02

        try {
            float divisao = 7/0;
            System.out.println(divisao);
        } catch (ArithmeticException aE) {
            System.out.println("Erro 000 : O dividendo deve ser maior que 0.");
            System.out.println("Ocorreu um erro do tipo : " + aE.getMessage());
            aE.printStackTrace();

        }
    }

    //Funcao de exemplo
    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
