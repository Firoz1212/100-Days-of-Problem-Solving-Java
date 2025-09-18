
public class Day4_SecondLargestOptimized {
    public static int findSecondLargest(int[] arr) {
      int n = arr.length;
      if(n < 2){
        throw new IllegalArgumentException("array must have 2 element");
      }
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;
      for(int num : arr){
        if(num  > largest){
            secondLargest = largest;
            largest = num;
        } else if(num > secondLargest && num != largest){
       secondLargest = num;
        }
      }
      return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest (Optimized): " + findSecondLargest(arr));
        // Output: 34
    }
}
