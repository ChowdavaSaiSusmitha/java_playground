package collectionspractice.classmethods;

import java.util.LinkedList;

public class LinkedListImplement {

    public static void show() {
        System.out.println("\n===@@@ LinkedList Demo @@@===");

        // LinkedList stores elements in nodes
        LinkedList<String> tasks = new LinkedList<>();

        //  insert at end
        tasks.add("Wake up");
        tasks.add("Study Java");

        // insert at the front or back
        tasks.addFirst("Drink water");
        tasks.addLast("Sleep");

        System.out.println("Daily tasks: " + tasks);

        //  returns first/last elements
        System.out.println("First task: " + tasks.getFirst());
        System.out.println("Last task: " + tasks.getLast());

        // add element at the end like queue behavior
        tasks.offer("Review notes");
        System.out.println("After offer(): " + tasks);

        //  view head
        System.out.println("Peeked head: " + tasks.peek());

        //  remove and return first element
        String firstTask = tasks.poll();
        System.out.println("Removed first task: " + firstTask);
        System.out.println("Tasks after poll(): " + tasks);

        System.out.println("Removed first element: " + tasks.removeFirst());
        System.out.println("Removed last element: " + tasks.removeLast());
        System.out.println("Final task list: " + tasks);
    }
}
