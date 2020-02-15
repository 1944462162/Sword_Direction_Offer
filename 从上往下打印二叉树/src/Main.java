/**
 * Author: wangJianBo
 * Date: 2020/2/15 10:16
 * Content: 二叉树的层序遍历
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }
 }
class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null){
            return arrayList;
        }
        int length = queue.size();
        while (!queue.isEmpty()){
            for (int i = 0; i < length; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null){
                    arrayList.add(treeNode.val);
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
            }
        }
        return arrayList;
    }
}
/**
 *     2
 *   3   5
 * 4  6  9  10
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
        treeNode2.left = null;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = solution.PrintFromTopToBottom(treeNode1);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
