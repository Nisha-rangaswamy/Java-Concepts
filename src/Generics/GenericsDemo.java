package Generics;

import java.util.ArrayList;
public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add(10);
        list.add(1.5);
        System.out.println(list.get(0));
    }
}
