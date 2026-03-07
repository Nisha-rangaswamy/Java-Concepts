package CollectionFrameworks;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);

        System.out.println("Array list: " + list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.remove(3));
        System.out.println("Array list: " + list);

        for(int i: list){
            System.out.println(i);
        }
    }
}
/**
 * Features
 * Maintains the insertion order
 * Allows duplicates
 * Dynamic size
 * Supports Index based access
 *Fast for reading elements
 */