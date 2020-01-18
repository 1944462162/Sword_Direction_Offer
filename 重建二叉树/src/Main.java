import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/12/7 9:25
 * Content:
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length > 0 && in.length > 0){
            TreeNode root = new TreeNode(pre[0]);
            int mid = pre[0];
            int num = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] == mid){
                    num = i;
                }
            }
            int[] preLeft = Arrays.copyOfRange(pre,1,num+1);
            int[] preRight = Arrays.copyOfRange(pre,num+1,pre.length);

            int[] inLeft = Arrays.copyOfRange(in,0,num);
            int[] inRight = Arrays.copyOfRange(in,num+1,in.length);

            root.left = reConstructBinaryTree(preLeft,inLeft);
            root.right = reConstructBinaryTree(preRight,inRight);
            return root;
        }
        else{
            return null;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {9};
        int[] b = {9};
        Solution solution = new Solution();
        TreeNode ans = solution.reConstructBinaryTree(a,b);
        printTree(ans);
    }
    private static void  printTree(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        System.out.println(treeNode.val);
        printTree(treeNode.left);
        printTree(treeNode.right);
    }
}
