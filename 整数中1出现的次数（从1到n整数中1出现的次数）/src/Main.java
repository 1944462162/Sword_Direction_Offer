/**
 * Author: wangJianBo
 * Date: 2020/2/15 17:21
 * Content:
 */

class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.valueOf(i).toString();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1'){
                    count++;
                }
            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.NumberOf1Between1AndN_Solution(13);
        System.out.println(i);
    }
}
