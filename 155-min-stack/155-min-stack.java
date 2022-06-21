class MinStack {
    
    Stack<Integer> sk;
    Stack<Integer> lk;

    public MinStack() {
        
       sk = new Stack<Integer>();
        lk = new Stack<Integer>();
    }
    
    public void push(int val) {
        sk.push(val);
        int min = val;
        if(!lk.isEmpty()) {
            min = lk.lastElement();
        }
        val = Math.min(val,min);
        lk.push(val);
    }
    
    public void pop() {
        sk.pop();
        lk.pop();
    }
    
    public int top() {
       return sk.lastElement();
    }
    
    public int getMin() {
       return lk.lastElement();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */