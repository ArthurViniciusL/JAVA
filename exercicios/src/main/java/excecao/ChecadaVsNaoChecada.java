package excecao;

import java.util.concurrent.ExecutionException;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) throws Exception {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        geraErro2();

        System.out.println("Fim!");

    }

    //Nao chegada
    public static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    //Checada:
    public static void geraErro2() throws Exception {
        try {
            throw new Exception("Ocorreu um erro bem legal #02!");
        } catch (ExecutionException e) {
            System.out.println("...");
        }
    }
}
