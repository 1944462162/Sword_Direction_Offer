/**
 * Author: wangJianBo
 * Date: 2020/3/1 15:08
 * Content: 二叉排序树 + 链表
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
class Solution {
    private TreeNode head = null;
    private TreeNode realHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        Convert(pRootOfTree.left);
        if (head == null){
            head = pRootOfTree;
            realHead = pRootOfTree;
        }
        else {
             head.right = pRootOfTree;
             pRootOfTree.left = head;
            head = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return realHead;
    }
}

/**
 *    5
 *  3   7
 * 2 4 6 8
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(8);

        treeNode3.left = treeNode1;
        treeNode3.right = treeNode4;
        treeNode1.left = treeNode;
        treeNode1.right = treeNode2;
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;
        Solution solution = new Solution();
        TreeNode treeNode7 = solution.Convert(treeNode3);
        while (treeNode7 != null){
            System.out.println(treeNode7.val);
            treeNode7 = treeNode7.right;
        }
    }
}
