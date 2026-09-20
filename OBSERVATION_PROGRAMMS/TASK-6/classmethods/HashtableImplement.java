package collectionspractice.classmethods;

import java.util.Hashtable;
import java.util.Map;

public class HashtableImplement {

    public static void show() {
        System.out.println("\n===### Hashtable Demo ###===");

        Map<String, Integer> gadgets = new Hashtable<>();
        //hashtable stores in two fields :keys and values 
        //it does not allow duplicates
        gadgets.put("Laptop", 2);
        gadgets.put("Mobile", 10);
        gadgets.put("Tablet", 5);

        System.out.println("Stock table: " + gadgets);
        System.out.println("Available laptops: " + gadgets.get("Laptop"));
        System.out.println("Contains key Mobile? " + gadgets.containsKey("Mobile"));
        System.out.println("Contains value 5? " + gadgets.containsValue(5));

        // delete a mapping
        gadgets.remove("Tablet");
        System.out.println("After removing Tablet: " + gadgets);

        System.out.println("Total items: " + gadgets.size());
        System.out.println("Is map empty? " + gadgets.isEmpty());
        
        // get all keys and values
        System.out.println("Keys: " + gadgets.keySet());
        System.out.println("Values: " + gadgets.values());
    }
}
