/**
 * Reverses the elements of an array recursively.
 * Time Complexity: O(n)
 * - This method iterates over half of the array swapping elements, with each swap being constant time.
 * - The recursion depth is proportional to half the size of the array since it swaps elements from both ends towards the middle.
 * - Therefore, the time complexity of this approach is O(n).
 * @param arr The input array to be reversed.
 * @param begin The beginning index of the subarray.
 * @param end The ending index of the subarray.
 */

import java.util.Scanner;

public class Problem_7 {
    public static void reverseArray(int[] arr, int begin, int end) {

        if (begin >=end || arr == null || arr.length == 0)
            return;

        int temp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp;

        reverseArray(arr, begin + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1);

        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
