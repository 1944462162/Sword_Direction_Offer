import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/2/15 17:09
 * Content: 数组
 */
class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        Arrays.sort(input);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (k > input.length){
            return arrayList;
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = solution.GetLeastNumbers_Solution(new int[]{}, 0);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
