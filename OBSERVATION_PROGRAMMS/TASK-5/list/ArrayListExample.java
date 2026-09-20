package collectionspractice.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating a list to store fruits
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Mango");

        // Adding more fruits at once
        fruits.addAll(Arrays.asList("Orange", "Banana"));

        System.out.println("My fruits: " + fruits);
        System.out.println("Fruit at index 0: " + fruits.get(0));
        System.out.println("Is Apple present? " + fruits.contains("Apple"));
        System.out.println("Number of fruits: " + fruits.size());
        System.out.println("First Banana index: " + fruits.indexOf("Banana"));
        System.out.println("Last Banana index: " + fruits.lastIndexOf("Banana"));

        // Changing and removing fruits
        fruits.set(0, "Pear");
        fruits.remove("Banana");
        fruits.remove(0);

        // Sorting the fruits alphabetically
        fruits.sort(String::compareTo);

        System.out.println("First two fruits: " + fruits.subList(0, 2));
        System.out.println("After changing the list: " + fruits);

        // Reading the fruits one by one using an Iterator
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println("Fruit: " + iterator.next());
        }

        // Removing Orange from the list
        fruits.removeAll(Arrays.asList("Orange"));
        System.out.println("After removing Orange: " + fruits);

        // Removing all remaining fruits
        fruits.clear();

        System.out.println("Is the list empty? " + fruits.isEmpty());
    }
}
