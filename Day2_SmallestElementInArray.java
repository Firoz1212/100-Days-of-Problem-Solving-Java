// Day -2 Smallest Element in Array
public class Day2_SmallestElementInArray {

    // Function to find smallest element
    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        int min = arr[0]; // assume first element is smallest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 2, 9, 1};
        int[] arr2 = {-5, -2, -10};
        int[] arr3 = {42};

        System.out.println("Smallest in arr1: " + findSmallest(arr1)); // 1
        System.out.println("Smallest in arr2: " + findSmallest(arr2)); // -10
        System.out.println("Smallest in arr3: " + findSmallest(arr3)); // 42
    }
}

//Time Complexity: O(n) → Single pass through the array.

//Space Complexity: O(1) → Only one variable min.
