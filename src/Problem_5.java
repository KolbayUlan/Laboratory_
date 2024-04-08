/**
 * Calculates the nth Fibonacci number recursively.
 * Time Complexity: O(2^n)
 * - This method recursively computes Fibonacci numbers by branching into two recursive calls,
 *   each with an input reduced by 1 or 2.
 * - At each step, the number of recursive calls doubles (approximately), leading to an exponential
 *   growth in the number of function calls.
 * - Therefore, the time complexity of this approach is O(2^n).
 * @param n The index of the Fibonacci number to be calculated.
 * @return The nth Fibonacci number.
 */

import java.util.Scanner;

public class Problem_5 {
    public static int fibonacci(int n){
        if (n== 0)
            return 0;
        else if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibonacciNum = fibonacci(n);

        // Output the result
        System.out.println(fibonacciNum);

    }
}
