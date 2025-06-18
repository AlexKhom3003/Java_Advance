package be.IntecBrussel.obdrachten;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;


public class StreamExercises {
    // Exercises1 (Converts all strings toUppercase.)
    public List<String> toUppercase(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    // Exercises2 (Leaves only those lines that start with the letter "a")
    public List<String> filterA(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
    }

    // Exercises3 (Keeps only lines that: start with "a" and are longer than 3 characters)
    public List<String> filterB(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .collect(Collectors.toList());
    }

    // Exercises4 (Same as filterB but the result is sorted in reverse alphabetical order.)
    public List<String> filterC(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }

    // Exercises5 (Same as filterC, but instead of a list it returns a single string and the strings are joined by commas)
    public String filterD(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }

    // Exercises6 (Same as filterD but strings are capitalized)
    public String filterE(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }

    // Exercises7 (Selects only even numbers and calculates their arithmetic mean)
    public OptionalDouble averageEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();
    }

    // Exercises8 (Find the length of the longest string in the list)
    public int maxLength(List<String> strings) {
        return strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    // Exercises9 (Check if all numbers are even)
    public boolean allEven(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n % 2 == 0);
    }

    // Exercises10 (Calculate the product of all numbers)
    public int product(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    // Exercises11 (Remove all duplicate items from the list)
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}

