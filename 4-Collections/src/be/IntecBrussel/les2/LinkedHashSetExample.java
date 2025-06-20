package be.IntecBrussel.les2;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");// Duplicate element, wordt genegeerd
        System.out.println("LinkedHashSet: " + set); // [Apple, Banana, Orange]);

        // Controleren of een element in de LinkedHashSet zit
        boolean containsApple = set.remove("Apple");
        System.out.println("Contains Apple? "+ containsApple);//True

        // Een element uit de LinkedHashSet verwijderen
        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? " + removed); // true

        // De grootte van de LinkedHashSet opvragen
        int size = set.size();
        System.out.println("Size of LinkedHashSet: " + size); // 2

        // De LinkedHashSet leegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty); // true

    }
}
