import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2020/2/26 17:09
 * Content: 二叉树
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
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null){
            return true;
        }
        return hepl(pRoot);
    }

    private boolean hepl(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        queue.add(pRoot);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            TreeNode treeNode1 = queue.poll();
            if (treeNode == null && treeNode1 == null){
                continue;
            }
            if (treeNode == null || treeNode1 == null){
                return false;
            }
            if (treeNode.val != treeNode1.val){
                return false;
            }
            queue.add(treeNode.left);
            queue.add(treeNode1.right);
            queue.add(treeNode.right);
            queue.add(treeNode1.left);

        }
        return true;
    }
}

/**
 *     1
 *   2   2
 * 3  4 4  3
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        Solution solution = new Solution();
        boolean symmetrical = solution.isSymmetrical(treeNode);
        System.out.println(symmetrical);
    }
}
