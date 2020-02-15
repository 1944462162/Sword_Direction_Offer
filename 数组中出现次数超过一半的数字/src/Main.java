import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/2/15 17:00
 * Content: 数组
 */

class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (map.keySet().contains(array[i])){
                map.put(array[i],map.get(array[i]) + 1);
                if (map.get(array[i]) > array.length / 2){
                    return array[i];
                }
            }
            else {
                map.put(array[i],1);
                if (map.get(array[i]) > array.length / 2){
                    return array[i];
                }
            }
        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.MoreThanHalfNum_Solution(new int[]{});
        System.out.println(i);
    }
}
