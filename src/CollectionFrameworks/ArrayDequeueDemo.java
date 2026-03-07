package CollectionFrameworks;

import java.util.Deque;
import java.util.ArrayDeque;
public class ArrayDequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        System.out.println(dq);
    }
}
/**
 * Allows adding and removing from both the sides
 * faster than stack class which is legacy
 * can work like stack and queues
 */