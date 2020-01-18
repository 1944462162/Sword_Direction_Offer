/**
 * Author: wangJianBo
 * Date: 2019/12/8 19:07
 * Content:
 */

class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        double ans = base;
        if (exponent < 0){
            for (int i = 1; i < Math.abs(exponent);i++){
                ans *= base;
            }
            return 1/ans;
        }
        for (int i = 1; i < exponent; i++) {
            ans *= base;
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Power(2,-3));
    }
}
