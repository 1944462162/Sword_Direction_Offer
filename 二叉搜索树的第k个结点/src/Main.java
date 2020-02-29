/**
 * Author: wangJianBo
 * Date: 2020/2/29 8:34
 * Content: 二叉树的中序遍历
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
    private TreeNode treeNode;
    private int count = 0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        hepl(pRoot,k);
        return treeNode;
    }
    void hepl(TreeNode root, int k){
        if (root == null || count > k){
            return;
        }

        if(root.left != null){
            hepl(root.left,k);
        }
        count++;
        if (count == k){
            treeNode = root;
        }
        if(root.right != null){
            hepl(root.right,k);
        }
    }

}

/**
 *     5
 *   3   7
 * 2  4 6  8
 *
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
        TreeNode treeNode7 = solution.KthNode(treeNode3, 3);
        System.out.println(treeNode7.val);
    }
}
