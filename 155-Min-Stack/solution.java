public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
        Stack<Integer> stack = new Stack<>();
    }
    
    public void push(int x) {
        if(x <= min){
            if(!stack.isEmpty()){
                
                stack.push(min);
                stack.push(x);
                min = x;
            }else{
                stack.push(x);
                min = x;
            }
        }else{
            stack.push(x);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int temp = stack.pop();
        if(!stack.isEmpty() && temp <= min){
            min = stack.pop();
        }
        if(stack.isEmpty()) min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */