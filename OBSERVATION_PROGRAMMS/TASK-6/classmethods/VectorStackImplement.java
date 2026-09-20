package collectionspractice.classmethods;

import java.util.Stack;
import java.util.Vector;

public class VectorStackImplement {

    public static void show() {
        System.out.println("\n=== Vector and Stack Demo ===");

        // Vector is a synchronized list and works like ArrayList.
        Vector<String> names = new Vector<>();
        names.add("Aman");
        names.add("Babji");
        names.add("Charlie");

        System.out.println("Vector values: " + names);
        System.out.println("Name at index 1: " + names.get(1));
        names.set(1, "Bharat");
        System.out.println("After set(): " + names);

        //  remove by position
        names.remove(2);
        System.out.println("After remove(index): " + names);

        // check if a value exists
        System.out.println("Contains Alice? " + names.contains("Aman"));
        System.out.println("Vector size: " + names.size());
        System.out.println("Vector capacity: " + names.capacity());

        // Stack works on LIFO principle (Last In First Out)
        Stack<String> books = new Stack<>();
        books.push("Java Basics");
        books.push("OOP");
        books.push("Collections");

        System.out.println("Books stack: " + books);
        System.out.println("Top element without removing: " + books.peek());
        System.out.println("Removed top element: " + books.pop());
        System.out.println("Stack after pop: " + books);
        System.out.println("Is stack empty? " + books.empty());
        System.out.println("Search for OOP: " + books.search("OOP"));
    }
}
