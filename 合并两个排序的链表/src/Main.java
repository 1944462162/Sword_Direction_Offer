import java.util.ArrayList;
import java.util.Collections;

/**
 * Author: wangJianBo
 * Date: 2019/12/8 20:47
 * Content:
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ArrayList<Integer> list = new ArrayList<>();

        while(list1 != null){
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        ListNode listNode = new ListNode(-1);
        ListNode head = listNode;
        for (int i = 0; i < list.size(); i++) {
            ListNode listNode1 = new ListNode(list.get(i));
            listNode.next = listNode1;
            listNode = listNode.next;
        }
        return head.next;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(10);
        listNode.next = null;

        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(8);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        Solution solution = new Solution();
        ListNode s = solution.Merge(listNode,listNode4);
        while (s != null){
            System.out.print(s.val + " ");
            s = s.next;
        }
    }
}
