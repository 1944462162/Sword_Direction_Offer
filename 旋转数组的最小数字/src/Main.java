/**
 * Author: wangJianBo
 * Date: 2019/12/7 10:19
 * Content:
 */
import java.util.ArrayList;
class Solution {
    public int minNumberInRotateArray(int [] array) {
        int minn = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minn){
                minn = array[i];
            }
        }
        return minn;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,4,5,1,2};
        int res = solution.minNumberInRotateArray(a);
        System.out.println(res);
    }
}
