package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String>  aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Com foreach: ");
        for (String alunos : aprovados) {
            System.out.println(alunos);
        }

        System.out.println("\nCom Iterator:");
        Iterator <String> meuIterator = aprovados.iterator();
        //Enquanto houver um proximo
        while (meuIterator.hasNext()) {
            System.out.println(meuIterator.next());
        }
    }
}
