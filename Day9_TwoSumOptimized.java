import java.util.HashMap;

public class Day9_TwoSumOptimized {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // num - > index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 9 - 2 = 7
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // 0 , 1
            }
            map.put(nums[i], i); // 2,0

        }

        return new int[] { -1, -1 }; // If no solution
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
