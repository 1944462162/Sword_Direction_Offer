/**
 * Author: wangJianBo
 * Date: 2019/12/8 10:35
 * Content:
 */

class Solution {
    public int JumpFloor(int target) {
        if (target == 0)
        {
            return 1;
        }
        if (target < 0){
            return 0;
        }
        return JumpFloor(target-1) + JumpFloor(target-2);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.JumpFloor(3));
    }
}
