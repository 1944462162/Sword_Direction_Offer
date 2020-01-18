import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2019/12/8 20:24
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
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0;
        while (head != null)
        {
            stringBuilder.append(head.val).append(" ");
            head = head.next;
        }
        String[] s = stringBuilder.toString().split(" ");
        ListNode head1 = new ListNode(-1);
        ListNode listNode = head1;
        for (int i = s.length - 1; i >= 0; i--){
            ListNode listNode1 = new ListNode(Integer.valueOf(s[i]));
            listNode.next = listNode1;
            listNode = listNode.next;
        }

        return head1.next;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        Solution solution = new Solution();
        ListNode listNode4 = solution.ReverseList(null);
        while (listNode4 != null){
            System.out.println(listNode4.val);
            listNode4 = listNode4.next;
        }
    }
}
