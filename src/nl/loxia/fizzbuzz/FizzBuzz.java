package nl.loxia.fizzbuzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static List<String> fizzBuzzLijst(int input) {
        return IntStream.rangeClosed(1, input)
                .mapToObj(String::valueOf)
                .map(FizzBuzz::convertFizz)
                .collect(Collectors.toList());
    }

    private static String convertFizz(String s) {
        if (s.equals("3")) {
            return "Fizz";
        }
        return s;
    }

}
