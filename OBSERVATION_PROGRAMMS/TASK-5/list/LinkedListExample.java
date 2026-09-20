package collectionspractice.list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Study Java");
        tasks.addLast("Do exercise");
        tasks.addFirst("Wake up");
        tasks.offer("Go to sleep");

        System.out.println("Today's tasks: " + tasks);
        System.out.println("Second task: " + tasks.get(1));

        // Checking the first and last tasks
        System.out.println("First task: " + tasks.peek());
        System.out.println("Last task: " + tasks.peekLast());

        // Removing completed tasks
        System.out.println("Finished task: " + tasks.poll());
        System.out.println("Removed last task: " + tasks.removeLast());

        System.out.println("Tasks left: " + tasks);

        tasks.addFirst("Make a plan");
        tasks.addLast("Review the day");

        System.out.println("Removed first: " + tasks.removeFirst());
        System.out.println("Removed last: " + tasks.removeLast());

        System.out.println("Final tasks: " + tasks);
    }
}

