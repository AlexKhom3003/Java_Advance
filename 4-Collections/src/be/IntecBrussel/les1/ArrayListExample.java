package be.IntecBrussel.les1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store Strings
        ArrayList<String> list = new ArrayList<>();

        // Add names (Strings) to the ArrayList
        list.add("Nina");
        list.add("Janan");
        list.add("Maxim");
        list.add("Haytam");
        list.add("Abdessamad");
        list.add("Raphael");

        // Create an Iterator to loop through the list
        Iterator<String> itr = list.iterator();

        // Loop through the list and print each element
        while (itr.hasNext()) {
            // itr.next() returns the next element in the list
            System.out.println(itr.next());
        }
    }
}
