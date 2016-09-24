class MyStack {
    Queue<Integer> stack = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<Integer>();
        while(!stack.isEmpty()){
            temp.add(stack.poll());
        }
        stack.add(x);
        while(!temp.isEmpty()){
            stack.add(temp.poll());
        }
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        stack.poll();
    }

    // Get the top element.
    public int top() {
        return stack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}