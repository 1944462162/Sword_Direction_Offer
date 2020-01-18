import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2019/12/8 19:23
 * Content:
 */

class Solution {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                listA.add(array[i]);
            }
            if (array[i] % 2 == 0){
                listB.add(array[i]);
            }
        }
        listA.addAll(listB);
        for (int i = 0; i < listA.size(); i++) {
            array[i] = listA.get(i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {3,9,10,7,8,1};
        Solution solution = new Solution();
        solution.reOrderArray(a);
    }
}
