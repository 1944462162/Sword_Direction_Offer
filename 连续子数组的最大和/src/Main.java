/**
 * Author: wangJianBo
 * Date: 2020/2/17 10:04
 * Content: 数组
 */

class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int ans = Integer.MIN_VALUE;
       int m = 0;
        for (int i = 0; i < array.length - 1; i++) {
             m = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                m = Math.max(m,sum);
            }
            ans = Math.max(ans,m);
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sum = solution.FindGreatestSumOfSubArray(new int[]{1,-2,3,10,-4,7,2,-5});
        System.out.println(sum);
    }
}
