/**
 * Author: wangJianBo
 * Date: 2020/2/28 20:42
 * Content:
 */

import java.util.Arrays;

 class Solution {
    public int[] multiply(int[] A) {
        if (A.length == 0){
            return null;
        }
        int[] B = new int[A.length];
        Arrays.fill(B, 1);
        int leftProduct=1;
        int rightProduct=1;
        for(int i=0;i<A.length;i++){
            B[i]*=leftProduct;
            leftProduct*=A[i];
        }
        for(int i=A.length-1;i>=0;i--){
            B[i]*=rightProduct;
            rightProduct*=A[i];
        }

        return B;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] multiply = solution.multiply(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(multiply));
    }
}
