package IntecBrussel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jai", "Mahesh", "Hemant", "Naren");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream<Integer> stream = names.stream().map(s -> s.length());
        stream.forEach(System.out::println);

        System.out.println();

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
//        getList of unique squares
        List<Integer> squaresList = numbers.stream().map(i-> i * i ).distinct().collect(Collectors.toUnmodifiableList());
        squaresList.forEach(System.out::println);
    }
}
