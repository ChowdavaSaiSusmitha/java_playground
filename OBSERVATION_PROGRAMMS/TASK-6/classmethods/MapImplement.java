package collectionspractice.classmethods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplement {

    public static void show() {
        System.out.println("\n===&&& Map Demo &&&===");

        // HashMap stores key-value pairs without maintaining the order 
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Prabhash");
        students.put(102, "Ravi");
        students.put(103, "Prabhash");

        System.out.println("Student map: " + students);
        System.out.println("Value for key 101: " + students.get(101));
        System.out.println("Contains key 102? " + students.containsKey(102));
        System.out.println("Contains value Ravi? " + students.containsValue("Ravi"));
        System.out.println("Keys: " + students.keySet());
        System.out.println("Values: " + students.values());
        System.out.println("Entries: " + students.entrySet());

        students.remove(103);
        System.out.println("After removing 103: " + students);

        // LinkedHashMap keeps insertion order.
        Map<String, Integer> marks = new LinkedHashMap<>();
        marks.put("Math", 90);
        marks.put("Science", 88);
        marks.put("English", 95);
        System.out.println("LinkedHashMap order: " + marks);

        // TreeMap stores keys in sorted order.
        Map<String, Integer> budget = new TreeMap<>();
        budget.put("Food", 5000);
        budget.put("Travel", 2000);
        budget.put("Rent", 10000);
        System.out.println("TreeMap sorted keys: " + budget);
        System.out.println("First key: " + ((TreeMap<String, Integer>) budget).firstKey());
        System.out.println("Last key: " + ((TreeMap<String, Integer>) budget).lastKey());
    }
}
