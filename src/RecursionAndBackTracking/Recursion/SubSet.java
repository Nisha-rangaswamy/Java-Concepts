package RecursionAndBackTracking.Recursion;

import java.util.*;

public class SubSet {

    public static void ArraySubSets(int[] arr, int index, List<Integer> current) {
        //Base Case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        //Add the element
        current.add(arr[index]);
        ArraySubSets(arr, index + 1, current);

        //BackTracking
        current.remove(current.size() - 1);

        //Skip and Explore
        ArraySubSets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArraySubSets(arr,0,new ArrayList<>());

        System.out.println("All possible subsets:");

    }
}

