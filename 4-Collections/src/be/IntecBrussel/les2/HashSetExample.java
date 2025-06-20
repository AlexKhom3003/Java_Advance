package be.IntecBrussel.les2;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Create a new HashSet to store String values
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");    // Adds "Apple" to the set
        set.add("Banana");   // Adds "Banana" to the set
        set.add("Orange");   // Adds "Orange" to the set
        set.add("Apple");    // Duplicate "Apple" will be ignored (HashSet stores only unique elements)
        set.add("null");     // Adds string "null" (not Java null, just a string with that text)
        set.add("null");     // Duplicate "null" string is ignored

        // Display the contents of the HashSet
        System.out.println("HashSet " + set);

        // Check if the set contains the element "Apple"
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple ? "+ containsApple);

        // Remove the element "Orange" from the set
        boolean removed = set.remove("Orange");
        System.out.println("Removed orange ? " + removed);

        // Get the current size of the set
        int size = set.size();
        System.out.println("Size of HashSet: "+ size);

        // Clear all elements from the set
        set.clear();

        // Check if the set is empty after clearing
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? "+ isEmpty);
    }
}
