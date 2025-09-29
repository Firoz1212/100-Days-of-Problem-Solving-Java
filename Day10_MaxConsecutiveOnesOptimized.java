public class Day10_MaxConsecutiveOnesOptimized {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int j = 0; j < nums.length; j++) { // 1 to 6
            if (nums[j] == 1) {
                count++;
                maxCount = Math.max(maxCount, count); // 3,2
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums)); // Output: 3
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)