import java.util.Arrays;
import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/2/15 20:55
 * Content: 查找
 */

class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.keySet().contains(array[i])){
                map.put(array[i],map.get(array[i]) + 1);
            }
            else {
                map.put(array[i],1);
            }
        }
        int[] a = new int[2];
        int k = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1){
                a[k++] = integer;
            }
        }
        num1[0] = a[0];
        num2[0] = a[1];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.FindNumsAppearOnce(new int[]{2,2,1,5,5,4},new int[1], new int[1]);
    }
}
