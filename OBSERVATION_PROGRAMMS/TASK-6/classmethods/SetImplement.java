package collectionspractice.classmethods;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplement {

    public static void show() {
        System.out.println("\n=== Set Demo ===");

        // HashSet: no duplicates, no order guarantee
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("HashSet fruits: " + fruits);
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Set size: " + fruits.size());
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // LinkedHashSet keeps insertion order
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        System.out.println("LinkedHashSet order: " + cities);

        // TreeSet: stores in sorted order
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("TreeSet numbers: " + numbers);
        System.out.println("First element: " + ((TreeSet<Integer>) numbers).first());
        System.out.println("Last element: " + ((TreeSet<Integer>) numbers).last());

        numbers.clear();
        System.out.println("After clear(): " + numbers);
    }
}
