/**
 * Author: wangJianBo
 * Date: 2019/12/8 10:41
 * Content:
 */
class Solution {
    int sum = 0;
    public int JumpFloorII(int target) {
        if (target == 0){
            sum ++;
            return 1;
        }
        if (target < 0){
            return 0;
        }
        for (int i = 1; i <= target; i++) {
           JumpFloorII(target - i);
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.JumpFloorII(4));
    }
}
