class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // Move all items in q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        int store = 0;
        // Move everything back
        while (!q2.isEmpty()) {
            store = q2.remove();
            if (!q2.isEmpty()) {
                q1.add(store);
            }
        }
        // Return last item moved to q2
        return store;
    }
    
    /** Get the top element. */
    public int top() {
        // Move all items in q1 to q2
        int store = 0;
        while (!q1.isEmpty()) {
            store = q1.remove();
            q2.add(store);
        }
        // Move everything back
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        // Return last item moved to q2
        return store;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
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