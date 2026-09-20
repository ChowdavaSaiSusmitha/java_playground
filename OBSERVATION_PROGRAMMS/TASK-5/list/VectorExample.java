package collectionspractice.list;

import java.util.Vector;
// legacy class

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        // Vector has a few older method names as well as normal List methods.
        numbers.addElement(30);
        numbers.insertElementAt(5, 0);

        System.out.println("Numbers in the vector: " + numbers);
        System.out.println("First number: " + numbers.firstElement());
        System.out.println("Last number: " + numbers.lastElement());
        System.out.println("Vector capacity: " + numbers.capacity());

        numbers.removeElement(Integer.valueOf(20));
        numbers.set(0, 1);
        System.out.println("Numbers after changes: " + numbers);
    }
}
