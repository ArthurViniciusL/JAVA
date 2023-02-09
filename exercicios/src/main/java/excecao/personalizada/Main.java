package excecao.personalizada;

import excecao.Aluno;

public class Main {
    //Testando validacoes
    public static void main(String[] args) {

        try {
            Aluno aluno_a = new Aluno("", -7);
            Validar.infoAluno(aluno_a);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executou.");
        }


    }
}
