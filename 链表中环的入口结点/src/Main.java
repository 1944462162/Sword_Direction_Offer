import java.util.LinkedList;

/**
 * Author: wangJianBo
 * Date: 2020/2/29 14:53
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

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode preNode = pHead;
        ListNode curNode = pHead.next;
        if (pHead.next == null){
            return null;
        }
        boolean flag = false;
        //判断是否有环
        while (curNode.next != null){
            preNode = preNode.next;
            curNode = curNode.next.next;
            if (preNode == curNode){
                flag = true;
                break;
            }
        }
        if (!flag){
            return null;
        }
        //找出环的入口节点
        ListNode preNode1 = pHead;
        ListNode curNode1 = pHead.next;
        while (curNode1 != null){
            preNode1.next = null;
            preNode1 = curNode1;
            curNode1 = curNode1.next;
        }
        return preNode1;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode linkedList1 = new ListNode(1);
        ListNode linkedList2 = new ListNode(2);
        ListNode linkedList3 = new ListNode(3);
        ListNode linkedList4 = new ListNode(4);
        ListNode linkedList5 = new ListNode(5);
        ListNode linkedList6 = new ListNode(6);
        linkedList1.next = linkedList2;
        linkedList2.next = linkedList3;
        linkedList3.next = linkedList4;
        linkedList4.next = linkedList5;
        linkedList5.next = linkedList6;
        linkedList6.next = linkedList3;

        Solution solution = new Solution();
        ListNode listNode = solution.EntryNodeOfLoop(linkedList1);
        System.out.println(listNode.val);
    }
}
