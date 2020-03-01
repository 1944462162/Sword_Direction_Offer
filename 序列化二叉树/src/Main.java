import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2020/3/1 18:42
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
    private StringBuilder stringBuilder = new StringBuilder();
    String Serialize(TreeNode root) {
        if (root == null){
            return "";
        }
        hepl_S(root);
        return stringBuilder.toString();
    }

    private void hepl_S(TreeNode root) {
        if (root == null){
            stringBuilder.append("#");
            stringBuilder.append("!");
            return;
        }
        stringBuilder.append(root.val);
        stringBuilder.append("!");
        hepl_S(root.left);
        hepl_S(root.right);
    }

    TreeNode Deserialize(String str) {
        String[] strings = str.split("!");
        if (str == null || str.isEmpty()){
            return null;
        }
        return hepl(strings);
    }

    private TreeNode root;
    private int i = -1;
    private TreeNode hepl(String[] strings) {
        i++;
        if (i == 0){
            root = new TreeNode(Integer.valueOf(strings[i]));
            root.left = hepl(strings);
            root.right = hepl(strings);
        }
        else {
            if (!strings[i].equals("#")){
                TreeNode treeNode = new TreeNode(Integer.valueOf(strings[i]));
                treeNode.left = hepl(strings);
                treeNode.right = hepl(strings);
                return treeNode;
            }
            else {
                return null;
            }
        }

        return root;
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
        String serialize = solution.Serialize(treeNode3);
        System.out.println(serialize);
        TreeNode deserialize = solution.Deserialize("5!3!2!#!#!4!#!#!7!6!#!#!8!#!#!");
        hepl(deserialize);
    }

    private static void hepl(TreeNode deserialize) {
        if (deserialize == null){
            return;
        }
        System.out.println(deserialize.val);
        hepl(deserialize.left);
        hepl(deserialize.right);
    }
}