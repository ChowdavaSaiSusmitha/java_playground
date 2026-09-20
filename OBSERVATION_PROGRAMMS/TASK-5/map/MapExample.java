package collectionspractice.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapExample {
public static void main(String[] args) {
Map students = new TreeMap<>();
students.put(101, "Anu");
students.put(102, "Bala");
students.put(103, "Chitra");

// Roll number is the key and the name is its value.
System.out.println("Student list: " + students);
System.out.println("Name for roll number 101: " + students.get(101));
System.out.println("Is roll number 102 present? " + students.containsKey(102));
System.out.println("Is Chitra present? " + students.containsValue("Chitra"));
System.out.println("Only keys: " + students.keySet());
System.out.println("Only values: " + students.values());
System.out.println("Key and value together: " + students.entrySet());
students.remove(103);
System.out.println("After removing roll number 103: " + students);

NavigableMap marks = new TreeMap<>();
// TreeMap sorts entries by their keys.
marks.put(60, "Pass");
marks.put(80, "Good");
marks.put(95, "Excellent");

System.out.println("firstKey: " + marks.firstKey());
System.out.println("lastKey: " + marks.lastKey());
System.out.println("lowerKey(80): " + marks.lowerKey(80));
System.out.println("floorKey(80): " + marks.floorKey(80));
System.out.println("ceilingKey(85): " + marks.ceilingKey(85));
System.out.println("higherKey(80): " + marks.higherKey(80));
System.out.println("firstEntry: " + marks.firstEntry());
System.out.println("lastEntry: " + marks.lastEntry());
System.out.println("descendingMap: " + marks.descendingMap());
System.out.println("pollFirstEntry: " + marks.pollFirstEntry());
System.out.println("pollLastEntry: " + marks.pollLastEntry());
}
}