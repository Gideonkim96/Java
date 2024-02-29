package dev.kim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static final Random random = new Random();

    private record Person(String first) {

        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }

    }

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Cameron", "Donald", "Eva", "Francis"};

        Person kim = new Person("Kim");

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s + (" " + getRandomChar() + "."),
                s -> s + (" " + reverse(s, s.indexOf(" "))),
                Main::reverse,
                String::new,
                s -> "Howdy " + s,
                String::valueOf,
                kim::last,
                (new Person("MARY"))::last

        ));

        applyChanges(names, list);
        System.out.println();
    }

    private static void applyChanges(String[] names,
                                     List<UnaryOperator<String>> stringFunctions) {

        List<String> backedByArray = Arrays.asList(names);
        for (var function : stringFunctions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar() {
        return (char) random.nextInt('D', (int) 'M' + 1);
    }

    private static String reverse(String s) {
        return reverse(s, s.length());
    }

    private static String reverse(String s, int end) {
        return new StringBuilder(s.substring(0, end)).reverse().toString();
    }

}
