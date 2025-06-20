package be.IntecBrussel.les2;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // Create a TreeSet to store Integer values in natural (ascending) order
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements to the TreeSet
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);

        // Print the TreeSet (elements will be sorted automatically)
        System.out.println("TreeSet: " + set);

        // Get the first (smallest) element in the TreeSet
        Integer firstElement = set.first();
        // Get the last (largest) element in the TreeSet
        Integer lastElement = set.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Get the smallest element that is strictly greater than 5
        Integer higherValue = set.higher(5);
        System.out.println("Element higher than 5: " + higherValue);

        // Get the largest element that is strictly less than 5
        Integer lowerValue = set.lower(5);
        System.out.println("Element lower than 5: " + lowerValue);

        // Get the TreeSet in descending (reverse) order
        TreeSet<Integer> descendingSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println("Descending TreeSet: " + descendingSet);

        // Get a subset from element 3 (inclusive) to 8 (exclusive)
        TreeSet<Integer> subSet = new TreeSet<>(set.subSet(3, 8));
        System.out.println("Subset of TreeSet (from 3 to 8, exclusive): " + subSet);
    }
}
