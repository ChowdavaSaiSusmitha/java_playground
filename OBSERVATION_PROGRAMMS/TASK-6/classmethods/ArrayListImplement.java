package collectionspractice.classmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListImplement {

    public static void show() {
        System.out.println("\n===*** ArrayList Demo ***===");

        // ArrayList is a dynamic array. It grows or shrinks automatically when needed.
        List<String> students = new ArrayList<>();

        //  add element to the end
        students.add("Elon musk");
        students.add("Samurai");

        // insert at a specific position
        students.add(1, "virat");
        students.add("Elon musk");

        System.out.println("List after adding elements: " + students);

        // read element by position
        System.out.println("Student at index 0: " + students.get(0));

        //  replace existing value
        students.set(0, "Meera");
        System.out.println("After replacing index 0: " + students);

        //  search for an element
        System.out.println("Contains virat? " + students.contains("virat"));

        // indexOf and lastIndexOf helps to find duplicate positions
        System.out.println("First index of Asha: " + students.indexOf("Elon musk"));
        System.out.println("Last index of Asha: " + students.lastIndexOf("Elon musk"));

        // delete an element
        students.remove("Elon musk");
        System.out.println("After removing Elon musk: " + students);

        //  total number of elements
        System.out.println("List size: " + students.size());

        //  checks if list has no elements
        System.out.println("Is list empty? " + students.isEmpty());

        // arrange elements in order
        students.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + students);

        //  removes everything from the list
        students.clear();
        System.out.println("After clear(): " + students);
        System.out.println("Now empty? " + students.isEmpty());
    }
}
