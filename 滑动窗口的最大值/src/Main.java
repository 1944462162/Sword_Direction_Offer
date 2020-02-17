import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2020/2/17 10:36
 * Content: 数组
 */


class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {

        int i = 0;
        int j = i + size - 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (num.length == 0 || size == 0){
            return arrayList;
        }
        while (j < num.length){
            int m = Integer.MIN_VALUE;
            for (int k = i; k <= j; k++) {
                m = Math.max(num[k],m);
            }
            arrayList.add(m);
            i++;
            j++;
        }
        return arrayList;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = solution.maxInWindows(new int[]{1,2}, 1);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
