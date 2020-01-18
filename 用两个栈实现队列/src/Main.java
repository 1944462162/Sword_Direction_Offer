/**
 * Author: wangJianBo
 * Date: 2019/12/7 9:57
 * Content:
 */

import java.util.Stack;

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()){
            hepl();
        }

        return stack2.pop();
    }
    void hepl(){
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(3);
        System.out.println(solution.pop());
        solution.push(2);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
//        System.out.println(solution.pop());
    }
}
