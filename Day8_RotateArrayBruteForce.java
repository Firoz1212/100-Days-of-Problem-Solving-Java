import java.util.Arrays;

public class Day8_RotateArrayBruteForce {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        if (n == 0 || k == 0) {
            return;
        }
        k = k % n;
        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("Rotated Array by " + k + " steps (Brute Force): " + Arrays.toString(nums));
    }
}
