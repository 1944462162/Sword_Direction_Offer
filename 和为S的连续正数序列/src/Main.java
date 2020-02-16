/**
 * Author: wangJianBo
 * Date: 2020/2/16 10:02
 * Content:
 */


import java.util.ArrayList;
class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < sum; i++) {
            int count = 0;
            ArrayList arrayList = new ArrayList();
            for (int j = i; j < sum; j++) {
                count += j;
                arrayList.add(j);
                if (count > sum){
                    break;
                }
                if (count == sum){
                    ans.add(arrayList);
                    break;
                }
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> arrayLists = solution.FindContinuousSequence(100);
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
