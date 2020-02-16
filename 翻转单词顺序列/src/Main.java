/**
 * Author: wangJianBo
 * Date: 2020/2/16 10:44
 * Content: 字符串
 */

class Solution {
    public String ReverseSentence(String str) {
        String[] s = str.split(" ");
        if (s.length == 0){
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            if (i != 0){
                stringBuilder.append(s[i]).append(" ");
            }
            else{
                stringBuilder.append(s[i]);
            }
        }
        return stringBuilder.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.ReverseSentence(" ");
        System.out.println(s);

    }
}
