import java.util.*;

public class Day6_BruteForceDublicate {
    public static int removeDuplicates(int[] nums) {
     if(nums == null || nums.length == 0){
        return 0;
     }
    Set<Integer> set = new HashSet<>();
    for(int n:nums){
        set.add(n);
    }

    return set.size();


    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("old Length: " + arr.length);
        int newLen = removeDuplicates(arr);

        System.out.println("New Length: " + newLen);
        
    }
}
