package RecursionAndBackTracking.Iteration;

//Iterative way
public class SumOfNNatural {
    public static void main(String[] args) {
        int num=10;
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum is: " + sum);
    }
}
