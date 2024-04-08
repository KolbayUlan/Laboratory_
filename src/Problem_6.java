/**
 * Calculates the power of a number recursively using exponentiation by squaring.
 * Time Complexity: O(log n)
 * - This method reduces the problem size by half in each recursive call by using
 *   exponentiation by squaring technique.
 * - The number of recursive calls is proportional to the number of bits required
 *   to represent the exponent n in binary, which is log(n).
 * - Therefore, the time complexity of this approach is O(log n).
 * @param a The base.
 * @param n The exponent.
 * @return The result of a raised to the power of n.
 */

import java.util.Scanner;
public class Problem_6{
    public static double power(double a, int n) {
        if (n == 0)
            return 1;

        if (n <0){
            a = 1 /a;
            n = -n;
        }

        return (n % 2 == 0) ? power(a * a, n / 2) : a *power(a * a, (n - 1)/ 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();

        double res = power(a, n);

        System.out.println(res);

    }
}
