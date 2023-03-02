package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioStreamMap {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*
        * 1 - Fazer uma conversao binaria;
        * 2 - Converter para string;
        * 3 - Inverter a string;
        * 4 - Converter de volta para um inteiro;
        */

        UnaryOperator <String> inverter =
                str -> new StringBuilder(str).reverse().toString();
        Function<String, Integer> binarioParaInt =
                str -> Integer.parseInt(str, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }

}
