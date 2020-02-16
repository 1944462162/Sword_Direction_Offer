/**
 * Author: wangJianBo
 * Date: 2020/2/16 16:46
 * Content:
 */

class Solution {
    public int StrToInt(String str) {

        if (str.equals("")){
            return 0;
        }
        long sum  = 0;
        long k = 1;
        for(int i = str.length() - 1; i > 0; i--){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sum += k * (str.charAt(i) - '0');
                k *= 10;
            }
            else {
                return 0;
            }
        }

        if (str.charAt(0) == '+' || str.charAt(0) == '-' || (str.charAt(0) >= '0' && str.charAt(0) <= '9')){
            if (str.charAt(0) == '+'){
                if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
                    return 0;
                }
                return (int)sum;
            }
            if (str.charAt(0) == '-'){
                if ((0 - sum) > Integer.MAX_VALUE || (0 - sum) < Integer.MIN_VALUE){
                    return 0;
                }
                return (int)(0 - sum);
            }
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9'){
                long tmp = ((str.charAt(0) - '0') * k + sum);
                if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE){
                    return 0;
                }
                return (int)tmp;
            }
        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.StrToInt("123");
//                                   +2147483647
        System.out.println(i);
    }
}
