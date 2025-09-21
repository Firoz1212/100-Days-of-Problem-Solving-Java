import java.util.Arrays;

public class Day5_BruteSortedArray {
    public static boolean isSorted(int[] arr) {

        int[] copy = arr.clone();
        Arrays.sort(copy); //log n 
        for(int i=0;i<arr.length;i++){ // n
            if(arr[i] != copy[i]){
                return false;
            }
        }
      return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};
        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
    }
}
