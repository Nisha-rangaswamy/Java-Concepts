package Arrays.Basics;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr={5,13,76,98,34,23,12};

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum is: " + max);
    }
}
