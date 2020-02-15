import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2020/2/15 19:57
 * Content: 二叉树的遍历
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
    private int h;
    public int TreeDepth(TreeNode root) {
        help(root,0);
        return h;
    }

    private void help(TreeNode root, int step) {
        if (root == null){
            h = Math.max(h,step);
            return;
        }
        help(root.left, step + 1);
        help(root.right, step + 1);
    }
}

/**
 *     2
 *   3   5
 *  4 6 9 10
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(10);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        Solution solution = new Solution();
        System.out.println(solution.TreeDepth(treeNode1));
    }
}

