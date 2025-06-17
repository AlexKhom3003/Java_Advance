package be.IntecBrussel;

import java.util.Arrays;
import java.util.List;

public class StreamFilter3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","", "bc", "efg", "abcd", "", "jkl");

        //get count of empty string
        long count = strings.stream().filter(string ->string.isEmpty()).count();
    }
}
