package collectionspractice;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList fwl = new ArrayList();
        fwl.add(0, 134);
        fwl.add("rte");
        fwl.addFirst('t');
        fwl.addLast("hgh");
        fwl.add(12);
        System.out.println(fwl.retainAll(fwl));
        System.out.println(fwl.listIterator());
        System.out.println(fwl.parallelStream());
        System.out.println(fwl.toString());
        System.out.println(fwl.getClass());
        fwl.ensureCapacity(3);
        System.out.println(fwl);

        try {
            synchronized (fwl) {
                fwl.wait(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println(fwl.stream());
        System.out.println(fwl.toArray());
        System.out.println(fwl.clone());
        System.out.println(fwl.getLast());
        System.out.println(fwl.hashCode());
        // System.out.println(fwl.removeIf(null));
        System.out.println();
    }
}
