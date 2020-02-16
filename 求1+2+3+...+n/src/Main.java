/**
 * Author: wangJianBo
 * Date: 2020/2/16 16:07
 * Content: 思维扩散
 */

class Solution {
    public int Sum_Solution(int n) {
        return ((int)Math.pow(n,2) + n) >> 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.Sum_Solution(5);
        System.out.println(i);
    }
}
