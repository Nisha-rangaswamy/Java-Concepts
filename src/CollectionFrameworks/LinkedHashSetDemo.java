package CollectionFrameworks;

import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        link.add(10);
        link.add(20);
        link.add(30);
        System.out.println(link);
    }
}

/**
 * Does Not Allow Duplicates
 * Maintains the order of insertion- it acts like LinkedList
 * uses hashing internally
 * slightly slower than HashSet
 * no indexes
 * rest every function is same as hashSet
 */

