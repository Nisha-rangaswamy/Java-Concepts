package SearchingSortingAlgorithm;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr={8,6,1,7,4,9,2,5,3,10};

        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//or
class SelectionSort1{
    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 6, 1, 7, 4, 9, 2, 5, 3, 10};
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}