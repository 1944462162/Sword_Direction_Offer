/**
 * Author: wangJianBo
 * Date: 2020/2/15 18:12
 * Content: 数组
 */

class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]){
                c++;
            }
        }
        return c;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
