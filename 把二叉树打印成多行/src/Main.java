/**
 * Author: wangJianBo
 * Date: 2020/2/16 20:15
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
        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(pRoot);

            if (pRoot == null) {
                return arrayLists;
            }

            while (!queue.isEmpty()) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                int length = queue.size();
                for (int i = 0; i < length; i++) {
                    TreeNode treeNode = queue.poll();
                    if (treeNode != null) {
                        arrayList.add(treeNode.val);
                        if (treeNode.left != null){
                            queue.add(treeNode.left);
                        }
                        if (treeNode.right != null){
                            queue.add(treeNode.right);
                        }

                    }
                }
                arrayLists.add(arrayList);
            }
            return arrayLists;
        }
}

/**
 *   2
 *  1 3
 *9 8 4 7
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(9);
        TreeNode treeNode4 = new TreeNode(8);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        ArrayList<ArrayList<Integer>> print = solution.Print(treeNode);
        for (ArrayList<Integer> arrayList : print) {
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}


