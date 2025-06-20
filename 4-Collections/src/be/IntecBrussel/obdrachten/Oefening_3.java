package be.IntecBrussel.obdrachten;

import java.util.ArrayList;
import java.util.Scanner;

public class Oefening_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        System.out.println("Write a word (write 'end' to finish): ");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
        }

        System.out.println("You wrote these words:");

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }

}
