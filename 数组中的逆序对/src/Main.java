/**
 * Author: wangJianBo
 * Date: 2020/2/17 9:43
 * Content:
 */

class Solution {
    public int InversePairs(int [] array) {

        int k = 0;
        int i = 0;
        int j = array.length - 1;
        if (array.length <= 1){
            return 0;
        }
        while (j > 1){
            if (array[i] > array[j]){
                k = (k + 1) %  1000000007;
                i++;
            }
            if (i + 1 == j){
                i = 0;
                j--;
            }

        }
        return k;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.InversePairs(new int[]{1,2,3,4,5,6,7,0});
        System.out.println(i);
    }
}
