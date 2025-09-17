public class Day3_reverseArrayBruteForce {

public static int[] reverseArray(int[] arr){
int n = arr.length;
int[] rev = new int[n];

for(int i = 0;i<n;i++){
    rev[i] = arr[n - i - 1];
}

return rev;
}


    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
       int[] rev= reverseArray(arr);
       for(int num : rev){
        System.out.print(num+" ");
       }
    }
    
}
