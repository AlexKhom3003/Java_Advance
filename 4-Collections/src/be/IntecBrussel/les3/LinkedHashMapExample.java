package be.IntecBrussel.les3;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 8);
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 5);

        int quantityOfApple = linkedHashMap.get("Apple");
        System.out.println("Aantal appels: " + quantityOfApple);

        boolean containsBanana = linkedHashMap.containsKey("Banana");
        System.out.println("Bevat banaan? " + containsBanana);

        int size = linkedHashMap.size();
        System.out.println("Grootte van de LinkedHashMap: " + size);

        for (String key : linkedHashMap.keySet()) {
            System.out.println("Sleutel: " + key);
        }
        for (int value : linkedHashMap.values()) {
            System.out.println("Waarde: " + value);
        }
        linkedHashMap.clear();
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("Is de LinkedHashMap leeg? " + isEmpty);
    }
}
