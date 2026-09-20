package collectionspractice.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDequeExample {

    public static void main(String[] args) {

        // Queue: First In, First Out (FIFO)
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("First");
        queue.add("Second");

        System.out.println("People waiting: " + queue);
        System.out.println("Next person: " + queue.peek());
        System.out.println("Next person using element(): " + queue.element());
        System.out.println("Served using poll(): " + queue.poll());
        System.out.println("Served using remove(): " + queue.remove());
        System.out.println("Nobody waiting? " + queue.isEmpty());

        // Deque: Allows changes at both ends
        Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("First");
        deque.offerLast("Final");
        deque.addFirst("Middle");
        deque.addLast("Last");

        System.out.println("Deque before removing: " + deque);
        System.out.println("peekFirst: " + deque.peekFirst());
        System.out.println("peekLast: " + deque.peekLast());
        System.out.println("pollFirst: " + deque.pollFirst());
        System.out.println("pollLast: " + deque.pollLast());
        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("removeLast: " + deque.removeLast());
        System.out.println("Deque is empty? " + deque.isEmpty());
    }
}