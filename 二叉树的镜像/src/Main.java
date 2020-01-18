import sun.font.TextRecord;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2019/12/9 19:15
 * Content:
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
    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null){
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
    }
}

/**
 *           8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *
 *     	     8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(8);
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(10);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(9);
        TreeNode treeNode6 = new TreeNode(11);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        Solution solution = new Solution();
        solution.Mirror(treeNode);
        hepl(treeNode);
    }
    public static void hepl(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        System.out.println(treeNode.val);
        hepl(treeNode.left);
        hepl(treeNode.right);
    }
}
