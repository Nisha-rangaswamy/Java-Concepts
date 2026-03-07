package CollectionFrameworks;

import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("Start");
        list.addLast("Stop");

        System.out.println(list);
    }
}

/**
 * Features
 * Maintains insertion order
 * allows duplicates
 * uses node structure internally-no index
 * slower reading but faster insertions and deletions compared to ArrayList
 */