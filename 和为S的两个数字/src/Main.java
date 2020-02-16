/**
 * Author: wangJianBo
 * Date: 2020/2/16 10:21
 * Content: 查找
 */

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if (array.length == 0){
            return new ArrayList<>();
        }
        int i = 0;
        int j = array.length - 1;
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        while (i < j){
            if(array[i] + array[j] > sum){
                j--;
            }
            if (array[i] + array[j] < sum){
                i++;
            }
            if (i == j && array[i] < sum && i != array.length - 1){
                i++;
                j = array.length - 1;
            }
            if (i == array.length - 1){
                break;
            }
            if (array[i] + array[j] == sum){
                ArrayList arrayList = new ArrayList();
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                arrayLists.add(arrayList);
                i++;
                j = array.length - 1;
            }
        }
        int x = -999,y = -999,z = 999999;
        for (ArrayList<Integer> arrayList : arrayLists) {
            if (arrayList.get(0) * arrayList.get(1) < z){
                z = arrayList.get(0) * arrayList.get(1);
                x = arrayList.get(0);
                y = arrayList.get(1);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (x == -999 && y == -999){
            return arrayList;
        }
        arrayList.add(x);
        arrayList.add(y);
        return arrayList;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = solution.FindNumbersWithSum(new int[]{}, 0);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
