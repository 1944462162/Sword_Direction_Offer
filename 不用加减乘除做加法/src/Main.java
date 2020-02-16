/**
 * Author: wangJianBo
 * Date: 2020/2/16 16:15
 * Content: 二进制
 */
class Solution {
    public int Add(int num1,int num2) {
        do {
            int a = num1 ^ num2;
            int b = (num1 & num2) << 1;
            num1 = a;
            num2 = b;
        }while (num2 != 0);
        return num1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int add = solution.Add(5, 6);
        System.out.println(add);
    }
}
