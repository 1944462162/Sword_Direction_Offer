/**
 * Author: wangJianBo
 * Date: 2020/1/18 10:20
 * Content:
 */

 class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeLinkNode hepl(TreeLinkNode root){
        if (root.right == null && root.left == null){
            return root;
        }
        if (root.left == null){
            return hepl(root.right);
        }
        return hepl(root.left);
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right == null){
            return null;
        }
        return hepl(pNode.right);
    }
}

/**
 *     3
 *    6 7
 *  9 8 1 2
 */
public class Main {
    public static void main(String[] args) {
        TreeLinkNode treeLinkNode = new TreeLinkNode(3);
        TreeLinkNode treeLinkNode1 = new TreeLinkNode(6);
        TreeLinkNode treeLinkNode2 = new TreeLinkNode(7);
        TreeLinkNode treeLinkNode3 = new TreeLinkNode(9);
        TreeLinkNode treeLinkNode4 = new TreeLinkNode(8);
        TreeLinkNode treeLinkNode5 = new TreeLinkNode(1);
        TreeLinkNode treeLinkNode6 = new TreeLinkNode(2);
        TreeLinkNode treeLinkNode8 = new TreeLinkNode(10);
        treeLinkNode.left = treeLinkNode1;
        treeLinkNode.right = treeLinkNode2;
        treeLinkNode1.left = treeLinkNode3;
        treeLinkNode1.right = treeLinkNode4;
        treeLinkNode2.left = treeLinkNode5;
        treeLinkNode2.right = treeLinkNode6;
        treeLinkNode5.right = treeLinkNode8;
        Solution solution = new Solution();
        TreeLinkNode treeLinkNode7 = solution.GetNext(treeLinkNode3 );
        System.out.println(treeLinkNode7.val);
    }
}
