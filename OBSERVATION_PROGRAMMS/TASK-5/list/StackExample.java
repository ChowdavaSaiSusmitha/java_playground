package collectionspractice.list;

import java.util.Stack;
// legacy class

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("SQL");
        books.push("Collections");

        // The last book placed on the stack is removed first.
        System.out.println("Books in the stack: " + books);
        System.out.println("Book on top: " + books.peek());
        System.out.println("SQL position from top: " + books.search("SQL"));
        System.out.println("Taking out: " + books.pop());
        System.out.println("Books left: " + books);
        System.out.println("Is the stack empty? " + books.empty());
    }
}
