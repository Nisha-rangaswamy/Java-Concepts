package Arrays.Basics;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int[] PrefixSum=new int[arr.length];

        //First element remains same
        PrefixSum[0]=arr[0];

        //Build prefix Array
        for(int i=1;i<arr.length;i++) {
            PrefixSum[i] = PrefixSum[i - 1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(PrefixSum[i] + " ");
        }
        System.out.println();
        //.........Prefix Sum Over.............//

        int l=0;
        int R=3;

        int sum;
        if(l==0)
            sum=PrefixSum[R];
        else
            sum=PrefixSum[R] - PrefixSum[l-1];
        System.out.println();


        System.out.println("sum of range between index 1 to 3: " + sum);
    }
}
