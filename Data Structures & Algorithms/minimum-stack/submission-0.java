class MinStack {
        Stack<Integer> stack = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> dynamic = (Stack<Integer>) stack.clone();
        int min = dynamic.pop();
        while(!dynamic.isEmpty()){
            if(dynamic.peek() <= min){
                min = dynamic.pop();
            }
            else{
                dynamic.pop();
            }
        }
        return min;
    }
}
