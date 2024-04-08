import java.util.Scanner;

public class Problem_1 {
    public static int findMin(int[] arr, int n) {
        //If only one element in the array, return it
        if (n == 1)
            return arr[0];

        //finding the minimum of the rest of the array using recursive
        int minOfRest = findMin(arr, n - 1);

        // Comparing the min of the rest with the last element of the array and return the smaller one
        return Math.min(minOfRest, arr[n -1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the number of elements in the array
        int n =sc.nextInt();
        // Input an array of size n
        int[] arr = new int[n];

        // Input the elements of the array
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the minimum element using the findMin function
        int min = findMin(arr, n);
        // Output the minimum element
        System.out.println(min);
    }
}
