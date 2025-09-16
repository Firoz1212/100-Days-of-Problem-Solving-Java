// Day -2 Smallest Element in Array
public class Day2_SmallestElementInArray {

    // Function to find smallest element
    public static int findSmallest(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
    
        if(arr.length == 1)
         return arr[0];
    
    int n = arr.length;
    int mini =arr[0]; //3
     for(int i = 1;i<n;i++){ //  5 2 9 1
    if(arr[i]<mini){
        mini = arr[i];
    }
      
     }
     return mini;
    }


    public static void main(String[] args) {
        int[] arr1 = {3, 5, 2, 9, 1};
        int[] arr2 = {-5, -2, -10};
        int[] arr3 = {42};
        int[] arr4 = {};

        System.out.println("Smallest in arr1: " + findSmallest(arr1)); // 1
        System.out.println("Smallest in arr2: " + findSmallest(arr2)); // -10
        System.out.println("Smallest in arr3: " + findSmallest(arr3)); // 42
        System.out.println("Smallest in arr3: " + findSmallest(arr4)); 
    }
}

//Time Complexity: O(n) → Single pass through the array.

//Space Complexity: O(1) → Only one variable min.
