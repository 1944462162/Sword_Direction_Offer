/**
 * Author: wangJianBo
 * Date: 2020/2/15 10:35
 * Content: 树的遍历（搜索）
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }
 }
 class Solution {
    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
     Stack<Integer> stack = new Stack<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null){
            return arrayLists;
        }
        stack.add(root.val);
        hepl(root,target - root.val);

        return arrayLists;
    }

    private void hepl(TreeNode root, int target) {
        if (target == 0 && root.left == null && root.right == null){
            arrayLists.add(new ArrayList<>(stack));
            return;
        }

        if (root != null){

            if (root.left != null){
                stack.add(root.left.val);
                hepl(root.left, target - root.left.val);
                stack.pop();
            }
            if (root.right != null){
                stack.add(root.right.val);
                hepl(root.right, target - root.right.val);
                stack.pop();
            }
        }
    }
}
/**
 *     10
 *   5   12
 * 4  7
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(2);
//        TreeNode treeNode2 = new TreeNode(3);
//        TreeNode treeNode3 = new TreeNode(5);
//        TreeNode treeNode4 = new TreeNode(9);
//        TreeNode treeNode5 = new TreeNode(6);
//        TreeNode treeNode6 = new TreeNode(4);
//        TreeNode treeNode7 = new TreeNode(10);
//
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;
//        treeNode3.left = treeNode6;
//        treeNode3.right = treeNode7;
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> arrayLists = solution.FindPath(null, 2);
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.println(integer);
            }
        }
    }
}