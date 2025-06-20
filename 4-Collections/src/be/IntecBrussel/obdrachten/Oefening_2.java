package be.IntecBrussel.obdrachten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Oefening_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted numbers: " + numbers);
    }
}
