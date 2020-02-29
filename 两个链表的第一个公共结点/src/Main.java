/**
 * Author: wangJianBo
 * Date: 2020/2/29 15:15
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
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while (pHead1 != null){

            ListNode listNode = pHead2;
            while (listNode != null){

                if (pHead1 == listNode){
                    return pHead1;
                }
                listNode = listNode.next;
            }
            pHead1 = pHead1.next;
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode linkedList1 = new ListNode(0);
        ListNode linkedList2 = new ListNode(9);
        ListNode linkedList3 = new ListNode(1);
        ListNode linkedList4 = new ListNode(2);
//        ListNode linkedList5 = new ListNode(5);
//        ListNode linkedList6 = new ListNode(6);


        ListNode linkedList11 = new ListNode(3);
        ListNode linkedList22 = new ListNode(8);
        ListNode linkedList33 = new ListNode(9);
//        ListNode linkedList44 = new ListNode(7);
//        ListNode linkedList55 = new ListNode(2);
//        ListNode linkedList66 = new ListNode(1);



        linkedList1.next = linkedList2;
        linkedList2.next = linkedList3;
        linkedList3.next = linkedList4;
//        linkedList4.next = linkedList5;
//        linkedList5.next = linkedList6;
        linkedList11.next = linkedList3;


//        linkedList11.next = linkedList22;
//        linkedList22.next = linkedList33;
//        linkedList33.next = linkedList2;



        Solution solution = new Solution();
        ListNode listNode = solution.FindFirstCommonNode(linkedList1,linkedList11);
        System.out.println(listNode.val);
    }
}
