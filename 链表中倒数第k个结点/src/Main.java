/**
 * Author: wangJianBo
 * Date: 2019/12/8 20:00
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
    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null || k == 0){
            return null;
        }
        ListNode pre = head;
        ListNode cur = head;
        ListNode p = head;
        int length = 0;
        while(p != null){
            length++;
            p = p.next;
        }
        if (length < k){
            return null;
        }
        for (int i = 0; i < k -1; i++) {
            pre = pre.next;
        }
        while (pre.next != null){
            pre = pre.next;
            cur = cur.next;
        }
        return cur;
    }
}
public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode listNode = new ListNode(2);

        Solution solution = new Solution();

        head.next = listNode;
        listNode.next = null;
        ListNode listNodeAns = solution.FindKthToTail(head,0);
        System.out.println(listNodeAns.val);

    }
}
