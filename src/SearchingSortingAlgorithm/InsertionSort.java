package SearchingSortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 5, 1, 3, 6};

        for (int i = 1; i < arr.length; i++) {
            int sorted = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>sorted){
                arr[j+1]=arr[j];
                j--;
        }
        arr[j + 1] = sorted;
    }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
