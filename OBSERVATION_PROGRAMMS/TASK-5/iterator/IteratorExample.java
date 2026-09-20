package collectionspractice.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("SQL");
        subjects.add("HTML");

        // removes the current item
        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            String subject = iterator.next();
            System.out.println("Reading: " + subject);
            if (subject.equals("HTML")) {
                iterator.remove();
            }
        }
        System.out.println("Subjects after removing HTML: " + subjects);

        ListIterator<String> listIterator = subjects.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Reading from index: " + listIterator.nextIndex());
            listIterator.next();
        }
        // ListIterator can move backwards and forward
        while (listIterator.hasPrevious()) {
            String subject = listIterator.previous();
            System.out.println("Going backwards: " + subject);
            if (subject.equals("SQL")) {
                listIterator.set("Database");
            }
        }
        listIterator.add("Programming");

        System.out.println("Final subjects: " + subjects);
        System.out.println("Current previous index: " + listIterator.previousIndex());
    }
}
