package collectionspractice.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
Set fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple"); // A set keeps only one Apple.

System.out.println("Unique fruits: " + fruits);
System.out.println("Does it contain Apple? " + fruits.contains("Apple"));
System.out.println("Number of unique fruits: " + fruits.size());
fruits.remove("Banana");
System.out.println("After removing Banana: " + fruits);

NavigableSet numbers = new TreeSet<>();
// TreeSet keeps values in ascending order.
numbers.add(10);
numbers.add(20);
numbers.add(30);

System.out.println("Smallest number: " + numbers.first());
System.out.println("Largest number: " + numbers.last());
System.out.println("lower(20): " + numbers.lower(20));
System.out.println("floor(20): " + numbers.floor(20));
System.out.println("ceiling(25): " + numbers.ceiling(25));
System.out.println("higher(20): " + numbers.higher(20));
System.out.println("headSet(30): " + numbers.headSet(30));
System.out.println("tailSet(20): " + numbers.tailSet(20));
System.out.println("descendingSet: " + numbers.descendingSet());
System.out.println("pollFirst: " + numbers.pollFirst());
System.out.println("pollLast: " + numbers.pollLast());
System.out.println("remaining numbers: " + numbers);
}
}