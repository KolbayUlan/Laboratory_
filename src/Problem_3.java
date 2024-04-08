/**
 * Checks if a number is prime recursively.
 * Time Complexity: O(sqrt(n))
 * - This method iterates from 2 to sqrt(n) to check for divisibility.
 * - The loop runs until sqrt(n) which is proportional to the square root of the input number.
 * - Therefore, the time complexity is O(sqrt(n)).
 * @param n The number to be checked for primality.
 * @param m The divisor, initially set to sqrt(n).
 * @return true if the number is prime, false otherwise.
 */

import java.util.Scanner;

public class Problem_3 {
    public static boolean isPrime(int n, int m) {
        if (n <= 1)
            return false;
        if (m == 1)
            return true;
        if (n % m == 0)
            return false;

        return isPrime(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n, (int)Math.sqrt(n));

        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }

}
