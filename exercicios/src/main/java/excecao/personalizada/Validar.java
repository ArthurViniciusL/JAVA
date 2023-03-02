package excecao.personalizada;
import excecao.Aluno;

public class Validar {
    public Validar() {
    }

    public static void infoAluno(Aluno aluno) throws NumeroForaIntervaloException {
        /*A atribucao 'throws NumeroForaIntervaloException'
        * deve existir porque 'NumeroForaIntervaloException' não é uma exceção checada
        */
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno não pode ser nulo.");
        }
        //trim() é uma funcao para remover espacos
        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty() ) {
            throw new StringVaziaException("nome");
        }

        if (aluno.getNota() < 0 || aluno.getNota() > 10) {
            throw new NumeroForaIntervaloException("nota");
        }
    }
}
