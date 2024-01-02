class MinStack {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinStack() {
        allData = new Stack<>();
        minData = new Stack<>();
    }

    public void push(int val) {
        allData.push(val);
        if (minData.isEmpty() || val <= minData.peek()) {
            minData.push(val);
        }
    }

    public void pop() {
        if (allData.isEmpty()) return;
        int val = allData.pop();
        if (val == minData.peek()) {
            minData.pop();
        }
    }

    public int top() {
        if (allData.isEmpty()) return -1;
        else return allData.peek();
    }

    public int getMin() {
        if (minData.isEmpty()) return -1;
        else return minData.peek();
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