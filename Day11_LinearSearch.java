public class Day11_LinearSearch {

    // Function to perform Linear Search
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int target = 5;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found!");
        }
    }
}
