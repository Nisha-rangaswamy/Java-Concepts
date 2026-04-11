package DynamicProgramming.Memoization;
import java.util.*;
public class RecursionMemoization {
    static int fib(int n, int[] dp) {
            // Base case
        if (n <= 1) return n;

            // Check if already computed
        if (dp[n] != -1) return dp[n];

            // Store result in dp array
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Fibonacci of " + n + " is: " + fib(n, dp));
        }
    }

