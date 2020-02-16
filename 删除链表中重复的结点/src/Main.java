/**
 * Author: wangJianBo
 * Date: 2020/2/16 17:47
 * Content: 链表
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode preNode = new ListNode(-1);
        ListNode ans = preNode;
        preNode.next = pHead;
        ListNode curNode = pHead;

        while (curNode != null){
            if (curNode.next != null && curNode.val == curNode.next.val){
                while (curNode.next != null && curNode.val == curNode.next.val){
                    curNode = curNode.next;
                }
                preNode.next = curNode.next;
            }
            else {
                preNode = curNode;
            }
            curNode = curNode.next;
        }
        return ans.next;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(2);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        Solution solution = new Solution();
        ListNode listNode7 = solution.deleteDuplication(listNode);

        while (listNode7 != null){
            System.out.println(listNode7.val);
            listNode7 = listNode7.next;
        }
    }
}
