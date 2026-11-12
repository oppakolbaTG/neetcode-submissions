class MinStack {
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> stack = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        
        int top = stack.pop();
        if(top == minStack.peek()){
            minStack.pop();
            
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
