/**
 * Calculates the factorial of a non-negative integer recursively.
 * Time Complexity: O(n)
 * - This method iterates from n to 1, performing constant-time multiplication for each step.
 * - The recursion depth is equal to the value of n, hence the time complexity is linear
 *   in terms of the input size.
 * @param n The non-negative integer for which factorial is to be calculated.
 * @return The factorial of n.
 */

import java.util.Scanner;

public class Problem_4 {
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorial(n);

        System.out.println(factorial);

    }
}
