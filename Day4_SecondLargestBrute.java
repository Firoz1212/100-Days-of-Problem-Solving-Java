import java.util.*;

public class Day4_SecondLargestBrute {
    public static int findSecondLargest(int[] arr) {
        int n = arr.length;
        if( n < 2){
            throw new IllegalArgumentException("Array must have atleast 2 element");
        }
        Arrays.sort(arr);
        int largest = arr[n-1];
       for(int i=n-2;i>=0;i--){
        if(arr[i] != largest){
            return arr[i];
        }
       }

       throw new IllegalArgumentException("No second Largest Element");
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr1 = {};
        int[] arr2 = {12, 1};
        System.out.println("Second Largest (Brute Force): " + findSecondLargest(arr));
        System.out.println("Second Largest (Brute Force): " + findSecondLargest(arr1));
        System.out.println("Second Largest (Brute Force): " + findSecondLargest(arr2));

        // Output: 34
    }
}
