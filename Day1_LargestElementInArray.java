// Day -1 Largest Element in Array

public class Day1_LargestElementInArray {
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        
        int max = arr[0]; // assume first element is largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 89, 23};
        System.out.println("Largest element: " + findLargest(nums));
    }
}
