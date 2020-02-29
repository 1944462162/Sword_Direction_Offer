import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2020/2/29 18:27
 * Content: 二叉树的遍历求深度
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solution {


    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = hepl(root.right);
        int right = hepl(root.left);
        return Math.abs(left - right) <= 1;
    }

    private int hepl(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = hepl(root.left);
        int right = hepl(root.right);

        return Math.max(left, right) + 1;
    }
}

/**
 *    1
 *   2 3
 * 4  5  6
 *   7
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
//        treeNode3.left = treeNode4;
        treeNode3.right = treeNode6;
        treeNode5.left = treeNode7;

        Solution solution = new Solution();
        boolean b = solution.IsBalanced_Solution(treeNode4);
        System.out.println(b);
    }
}
