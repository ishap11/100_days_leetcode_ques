class MyStack {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;
    public MyStack() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();
    }
    
    public void push(int x) {
        while(!mainQ.isEmpty()){
            helperQ.add(mainQ.remove());
        }
        mainQ.add(x);
        while(!helperQ.isEmpty()){
            mainQ.add(helperQ.remove());
        } 
    }
    
    public int pop() {
        int removed = mainQ.remove();
        return removed;
    }
    
    public int top() {
        int peek = mainQ.peek();
        return peek;
    }
    
    public boolean empty() {
        return mainQ.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */