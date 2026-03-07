package CollectionFrameworks;

import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();

        //put()->inserts key-value pairs
        map.put(1,"Nisha");
        map.put(2,"Chaya");
        map.put(3,"Deeksha");
        System.out.println(map);

        //get()->retrieve the value
        System.out.println(map.get(1));

        //containsKey()
        System.out.println(map.containsKey(1));

        //remove
        System.out.println(map.remove(2));
    }
}
/**
 * Stores the element as key-value pair
 * key must be unique
 * values can be duplicated
 * Does not maintain the insertion order
 * uses hashing internally
 * here we use put(),get(),remove(),containsKey()->Important ones
 */