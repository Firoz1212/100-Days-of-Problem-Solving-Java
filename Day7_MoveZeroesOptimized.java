public class Day7_MoveZeroesOptimized {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        int index = 0;

        for (int i = 0; i < n; i++) { // n + n => n
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++; // 2 =0 1 2 3 4
            }
        }
        while (index < n) {
            nums[index] = 0;
            index++;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
