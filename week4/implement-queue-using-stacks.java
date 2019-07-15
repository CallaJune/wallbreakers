class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // Move all items in s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int store = s2.pop();
        // Move everything back
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        // Return last item moved to s2
        return store;
    }
    
    /** Get the front element. */
    public int peek() {
        // Move all items in s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int store = s2.peek();
        // Move everything back
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        // Return last item moved to s2
        return store;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */