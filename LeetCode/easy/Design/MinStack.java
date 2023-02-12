package Design;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    int min;

    public MinStack() {
        this.stack = new Stack<Integer>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            this.stack.push(min);
            min = val;
        }
        this.stack.push(val);
    }

    public void pop() {
        if (stack.pop().equals(min))
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
