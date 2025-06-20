package be.IntecBrussel.les1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a new LinkedList to store Strings
        LinkedList<String> list = new LinkedList<>();

        // Add names (Strings) to the LinkedList
        list.add("Jonathan");
        list.add("Deepika");
        list.add("Elmaz");
        list.add("Mausam");
        list.add("Abdulrazak");
        list.add("Rutger");

        // Use an Iterator to loop through the LinkedList
        Iterator<String> itr = list.iterator();

        // Loop through the list and print each element
        while (itr.hasNext()) {
            // itr.next() returns the next element in the list
            System.out.println(itr.next());
        }
    }
}
