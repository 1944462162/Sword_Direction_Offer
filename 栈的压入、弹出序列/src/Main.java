/**
 * Author: wangJianBo
 * Date: 2020/2/15 9:20
 * Content: 栈和队列
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushA.length; i++) {
            queue.add(pushA[i]);
        }
        int i = 0;
        loop:
        while (i < popA.length) {

            while (stack.isEmpty() || popA[i] != stack.peek()){
                if (queue.isEmpty()){
                    break loop;
                }
                stack.push(queue.poll());
            }

            while (popA[i] == stack.peek()){
                stack.pop();
                i++;
                if (stack.isEmpty() || i == popA.length){
                    break ;
                }
            }
        }
        if (queue.isEmpty() && stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.IsPopOrder(new int[]{}, new int[]{});
        System.out.println(b);
    }
}
