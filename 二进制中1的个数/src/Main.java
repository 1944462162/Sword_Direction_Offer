/**
 * Author: wangJianBo
 * Date: 2019/12/8 18:59
 * Content:
 */

class Solution {
    public int NumberOf1(int n) {
        String ans = Integer.toBinaryString(n);
        int num = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '1'){
                num++;
            }
        }
        return num;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.NumberOf1(-1));
    }
}
