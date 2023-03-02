package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

//Impimindo objetos com streams
public class CriandoStreams {
    public static void main(String[] args) {

        //Usando o consumer para uma funcao:
        Consumer<String> exiba = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(exiba);

        //Segundo exemplo:
        String[] maisLangs = {"Python", "Lisp", "Pearl", "Go\n"};

        //Metodo 1
        Stream.of(maisLangs).forEach(exiba);
        //Metodo 2
        Arrays.stream(maisLangs).forEach(exiba);
        //Metodo 3
        //Selecione do elemento 0 < 2
        Arrays.stream(maisLangs, 0, 2).forEach(exiba);
    }
}
