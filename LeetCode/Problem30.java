class MinStack {
    Stack<Integer> stack = null;
    Stack<Integer> asist = null;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        asist = new Stack();
    }
    
    public void push(int x) {
        stack.push(x);
        if(asist.size()==0||x<asist.peek()){
            asist.push(x);
        }else{
            asist.push(asist.peek());
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()&&!asist.isEmpty()){
            stack.pop();
            asist.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!asist.isEmpty()){
            return asist.peek();
        }
        return -1;
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