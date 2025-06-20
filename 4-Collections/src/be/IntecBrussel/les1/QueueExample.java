package be.IntecBrussel.les1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue and add elements to it
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Print the current state of the Queue
        System.out.println("Queue: " + queue); // [Alice, Bob, Charlie]

        // Peek at the front element (without removing it)
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement); // Alice

        // Poll the front element (retrieve and remove it)
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement); // Alice

        // Print the updated Queue
        System.out.println("Updated Queue: " + queue); // [Bob, Charlie]

        // Check if the Queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty); // false

        // Get the size of the Queue
        int size = queue.size();
        System.out.println("Size of Queue: " + size); // 2
    }
}
