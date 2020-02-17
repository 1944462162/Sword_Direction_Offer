/**
 * Author: wangJianBo
 * Date: 2020/2/17 9:07
 * Content: 二叉树的层序遍历 + 栈 + 队列
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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        int k = 1;
        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        if (pRoot == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int length = queue.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (k % 2 == 1){
                for (int i = 0; i < length; i++) {
                    TreeNode treeNode = queue.poll();
                    arrayList.add(treeNode.val);
                    if (treeNode.left != null){
                        queue.add(treeNode.left);
                    }
                    if (treeNode.right != null){
                        queue.add(treeNode.right);
                    }
                }
            }
            else{
                Stack<TreeNode> stack = new Stack<>();
                for (int i = length - 1; i >= 0; i--) {
                    TreeNode treeNode = queue.poll();
                    stack.add(treeNode);
                    if (treeNode.left != null){
                        queue.add(treeNode.left);
                    }
                    if (treeNode.right != null){
                        queue.add(treeNode.right);
                    }
                }
                while (!stack.isEmpty()){
                    arrayList.add(stack.pop().val);
                }
            }
            ans.add(arrayList);
            k++;
        }
        return ans;
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
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> print = solution.Print(treeNode1);
        for (ArrayList<Integer> arrayList : print) {
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}