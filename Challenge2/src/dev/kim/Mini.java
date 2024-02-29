package dev.kim;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Mini {

    public static void main(String[] args) {


        UnaryOperator<String> everyChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everyChar.apply("1234567890"));

        Supplier<String> ilovejava = () -> "I LOVE JAVA";
        System.out.println(ilovejava.get());
    }
}
