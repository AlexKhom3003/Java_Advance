package be.IntecBrussel.les1;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a new Vector to store Strings
        Vector<String> v = new Vector<>();

        v.add("Inas");
        v.add("Adem");
        v.add("Ilias");
        v.add("Marwane");

        // Iterate through the Vector using an Iterator
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
