package Arrays.Basics;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;

        int totalsum=n*(n+1)/2;
        int arrsum=0;

        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }
        int missingnum=totalsum-arrsum;
        System.out.println(missingnum);

    }
}
