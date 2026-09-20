package collectionspractice.classmethods;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDequeImplement {

    public static void show() {
        System.out.println("\n===$$$ Queue and Deque $$$===");

        // PriorityQueue gives elements in order according to priority.
        Queue<Integer> priorities = new PriorityQueue<>();
        priorities.offer(40);
        priorities.offer(10);
        priorities.offer(25);

        System.out.println("PriorityQueue: " + priorities);
        System.out.println("Head element: " + priorities.peek());
        System.out.println("Removed head: " + priorities.poll());
        System.out.println("Queue after poll: " + priorities);

        // ArrayDeque works as a double-ended queue.
        ArrayDeque<String> deck = new ArrayDeque<>();
        deck.addFirst("Java");
        deck.addLast("Python");
        deck.offerFirst("C++");

        System.out.println("Deque content: " + deck);
        System.out.println("First element: " + deck.peekFirst());
        System.out.println("Last element: " + deck.peekLast());
        System.out.println("Removed from front: " + deck.pollFirst());
        System.out.println("Removed from back: " + deck.pollLast());
        System.out.println("Final deque: " + deck);
    }
}
