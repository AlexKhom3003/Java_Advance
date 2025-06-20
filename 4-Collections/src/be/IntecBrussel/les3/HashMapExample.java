package be.IntecBrussel.les3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        int ageOfAlice = map.get("Alice");
        System.out.println("Leeftijd van Alice: " + ageOfAlice);

        boolean contiinsBob = map.containsKey("Bob");
        System.out.println("Bevat Bob? " + contiinsBob);

        int size = map.size();
        System.out.println("Grootte van de Map: " + size);

        for (String key : map.keySet()) {
            System.out.println("Sleutel: " + key);
        }

        for (int value : map.values()) {
            System.out.println("Waarde: " + value);
        }

        map.clear();
        boolean isEmpty = map.isEmpty();
        System.out.println("Is de Map leeg? " + isEmpty);

    }}
