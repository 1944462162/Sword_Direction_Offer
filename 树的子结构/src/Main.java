/**
 * Author: wangJianBo
 * Date: 2019/12/9 18:42
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
    boolean falg = false;
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null){
            return false;
        }
        if (root2 == null){
            return false;
        }
        if (root1.val == root2.val){
            falg =  DoseHasSubtree(root1,root2);
        }
         HasSubtree(root1.left,root2);
         HasSubtree(root1.right,root2);
         return falg;
    }
    public boolean DoseHasSubtree(TreeNode root1, TreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }

        if (root1.val != root2.val){
            return false;
        }
        return DoseHasSubtree(root1.left, root2.left) && DoseHasSubtree(root1.right, root2.right);
    }
}
public class Main {
    public static void main(String[] args) {
        /**
         *         1                 2
         *     2       5           3    4
         *  3    4   6    7
         */

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode4;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode4.right = treeNode6;
        treeNode4.left = treeNode5;

        TreeNode treeNode7 = new TreeNode(2);
        TreeNode treeNode8 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(4);
        treeNode7.left = treeNode8;
        treeNode7.right = treeNode9;

        Solution solution = new Solution();
        boolean ans = solution.HasSubtree(treeNode,treeNode7);
        System.out.println(ans);
    }
}
