public class Day10_MaxConsecutiveOnesBruteForce {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) { // 1 to 6
                if (nums[j] == 1) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    break;
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums)); // Output: 3
    }
}
// Time Complexity: O(n²)
// Space Complexity: O(1)