package CollectionFrameworks;

import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(10);
        System.out.println(set);
    }
}
/**
 * No Duplicates
 * Automatically sorts the data
 * uses Red and Black tree internally
 * slower than hashset
 * used when we want the data to be sorted
 */
