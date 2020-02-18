/**
 * Author: wangJianBo
 * Date: 2020/2/18 9:20
 * Content: 二叉搜索树
 */

import java.util.Arrays;

/**
 * 思路：
 *  1.首先根据最后一个节点是根节点，判断数组中哪部分是左子树，哪部分是右子树
 *  2.递归判断左子树是不是二叉搜索树。递归判断右子树是不是二叉搜索树
 */
class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0){
            return false;
        }
        return hepl(sequence,0,sequence.length - 1);
    }

    private boolean hepl(int[] sequence,int start, int end) {
        if (start >= end){
            return true;
        }
        int i = 0;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]){
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]){
                return false;
            }
        }
        boolean left = true;
        if (i > 0){
            left = hepl(sequence,0,i-1);
        }
        boolean right = true;
        if (i < end - 1){
            right = hepl(sequence,i,end - 1);
        }
        return (left && right);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.VerifySquenceOfBST(new int[]{1,2});
        System.out.println(b);
    }
}
