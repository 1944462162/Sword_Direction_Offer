/**
 * Author: wangJianBo
 * Date: 2019/12/8 10:30
 * Content:
 */

class Solution {
    public int Fibonacci(int n) {
        int[] a = new int[40];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i-1] + a[i - 2];
        }
        return a[n];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Fibonacci(10));
    }
}
