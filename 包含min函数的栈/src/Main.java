/**
 * Author: wangJianBo
 * Date: 2019/12/9 18:22
 * Content:
 */
import java.util.Stack;

class Solution {

    Stack<Integer> stack = new Stack<>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        for (int i = 0; i < stack.size(); i++) {
            min = Math.min(stack.get(i),min);
        }
        return min;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);
        System.out.println(solution.min());
    }
}
