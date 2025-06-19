package IntecBrussel.obdrachten;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        StreamExercises exe = new StreamExercises();
        List<String> words = Arrays.asList("apple", "banana", "avocado", "apricot", "axe", "abc", "almond", "a");
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 4, 6, 10);

        System.out.println("Exercises 1: " + exe.toUppercase(words));
        System.out.println("Exercises 2: " + exe.filterA(words));
        System.out.println("Exercises 3: " + exe.filterB(words));
        System.out.println("Exercises 4: " + exe.filterC(words));
        System.out.println("Exercises 5: " + exe.filterD(words));
        System.out.println("Exercises 6: " + exe.filterE(words));
        System.out.println("Exercises 7: " + exe.averageEven(numbers).orElse(0));
        System.out.println("Exercises 8: " + exe.maxLength(words));
        System.out.println("Exercises 9: " + exe.allEven(numbers));
        System.out.println("Exercises 10: " + exe.product(numbers));
        System.out.println("Exercises 11: " + exe.removeDuplicates(numbers));

    }
}
