package be.IntecBrussel.les1;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Create a new ArrayList to store city names
        ArrayList<String> cities = new ArrayList<>();

        // Add cities to the ArrayList
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");
        cities.add("Amsterdam");

        // Add a duplicate element (Leuven appears twice)
        cities.add("Leuven");

        // Insert an element ("Genk") at index 3
        // The element at index 3 ("Gent") and all subsequent elements are shifted to the right
        cities.add(3, "Genk");

        // Print the entire ArrayList using forEach and a lambda expression
        System.out.println("ArrayList ->");
        cities.forEach(city -> System.out.println(city + " "));
    }
}
