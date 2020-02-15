import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/2/15 18:33
 * Content: 丑数的二三五的倍数仍然是丑数
 */

class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0){
            return 0;
        }
        int[] nums = new int[index];
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        nums[0] = 1;
        int k = 0;
        while (k < index - 1){

            int tmp = Math.min(2 * nums[i1],Math.min(3 * nums[i2],5 * nums[i3]));
            if (2 * nums[i1] == tmp) i1++;

            if (3 * nums[i2] == tmp) i2++;

            if (5 * nums[i3] == tmp) i3++;

            nums[++k] = tmp;

        }
        return nums[index - 1];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 1; i <= 20; i++) {
            int a = solution.GetUglyNumber_Solution(i);
            System.out.println(a);
        }

    }
}
