/**
 * Author: wangJianBo
 * Date: 2020/1/19 10:11
 * Content: 动态规划
 */
class Solution {
    private int[] f;
    public int hepl(int m){
        if (m == 0){
            return 1;
        }
        if (m < 0){
            return 0;
        }
        int ans = -1;
        if (f[m] >= 0){
            return f[m];
        }
        for (int i = 1; i <= m; i++) {
            ans = Math.max(hepl(m - i) * i,ans);
        }
        return  f[m] = ans;
    }
    public int cutRope(int target) {
        if (target == 0 || target == 1){
            return 0;
        }
        if (target == 2){
            return 1;
        }
        if (target == 3){
            return 2;
        }
        f = new int[target + 5];
        for (int i = 0; i < target + 5; i++){
            f[i] = -1;
        }
        return hepl(target);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.cutRope(4);
        System.out.println(i);
    }
}
