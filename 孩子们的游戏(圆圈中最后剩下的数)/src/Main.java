import java.util.LinkedList;

/**
 * Author: wangJianBo
 * Date: 2020/2/18 10:12
 * Content: 链表
 */

class Solution {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        int a = 0;
        while (linkedList.size() > 1){
            a = (a + m - 1) % linkedList.size();
            linkedList.remove(a);
        }
        if (linkedList.size() == 1){
            return linkedList.getFirst();
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.LastRemaining_Solution(5 ,3);
        System.out.println(i);
    }
}
