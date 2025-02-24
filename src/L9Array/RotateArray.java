package L9Array;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 5;
        rotate(arr, k);
        System.out.print("Rotated Array: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to rotate the array to the right by k steps
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle cases where k > n
        reverse(arr, 0, n - 1);   // Reverse the entire array
        reverse(arr, 0, k - 1);   // Reverse first k elements
        reverse(arr, k, n - 1);   // Reverse remaining elements
    }

    // Function to reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}