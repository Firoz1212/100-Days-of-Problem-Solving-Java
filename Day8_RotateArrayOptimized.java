import java.util.Arrays;

public class Day8_RotateArrayOptimized {

    // Optimized Approach (Reverse Trick)
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return;
        }
        k = k % n;
        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);

    }

    private static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("Rotated Array by " + k + " steps (Optimized): " + Arrays.toString(nums));
    }
}
