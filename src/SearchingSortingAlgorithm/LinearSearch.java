package SearchingSortingAlgorithm;

public class LinearSearch {
    static int Linearsearch(int key,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 7, 1, 18, 20, 11, 36};
        int key = 11;

        int result = Linearsearch(key, arr);
        if (result != -1) {
            System.out.println("Element found in index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}