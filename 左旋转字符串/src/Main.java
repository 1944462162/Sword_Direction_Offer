/**
 * Author: wangJianBo
 * Date: 2020/2/16 9:55
 * Content: 字符串处理
 */


class Solution {
    public String LeftRotateString(String str,int n) {
        if (str.equals("")){
            return "";
        }
        String s1 = str.substring(0,n);
        String s2 = str.substring(n);
        return s2 +s1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String abcXYZdef = solution.LeftRotateString("", 0);
        System.out.println(abcXYZdef);
    }
}
