public class Day7_MoveZeroesBruteForce {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // n
        int index = 0;

        for (int i = 0; i < n; i++) { // n + n => n
            if (nums[i] != 0) {
                result[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 }; // 1 3 12 0 0
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
