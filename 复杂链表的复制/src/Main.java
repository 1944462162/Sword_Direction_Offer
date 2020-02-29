/**
 * Author: wangJianBo
 * Date: 2020/2/29 14:31
 * Content:
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode randomListNode = pHead;
        RandomListNode randomListNode1 = randomListNode;
        while (pHead != null){

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        RandomListNode randomListNode1 = new RandomListNode(2);
        RandomListNode randomListNode2 = new RandomListNode(5);
        RandomListNode randomListNode3 = new RandomListNode(6);
        RandomListNode randomListNode4 = new RandomListNode(8);
        RandomListNode randomListNode5 = new RandomListNode(1);
        randomListNode1.next = randomListNode2;
        randomListNode2.next = randomListNode3;
        randomListNode3.next = randomListNode4;
        randomListNode4.next = randomListNode5;
        randomListNode1.random = randomListNode3;
        randomListNode2.random = randomListNode5;
        randomListNode3.random = randomListNode4;

        RandomListNode clone = solution.Clone(randomListNode1);
    }
}
