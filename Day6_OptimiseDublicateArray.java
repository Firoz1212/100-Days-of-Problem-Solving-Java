public class Day6_OptimiseDublicateArray {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
         }
       int p1=0;
       for(int p2=1;p2<nums.length; p2++){
        if(nums[p2] != nums[p1]){
            p1++;
            nums[p1] = nums[p2];
        }
       }
       return p1+1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int newLen = removeDuplicates(arr);

        System.out.println("New Length: " + newLen);
      
    }
}
