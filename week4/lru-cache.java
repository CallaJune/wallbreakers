class LRUCache {
    class DoubleListNode {
        DoubleListNode prev;
        DoubleListNode next;
        int key;
        int val;
        DoubleListNode (int k, int v) {
            key = k;
            val = v;
        }
    }

    int capacity;
    DoubleListNode head;
    DoubleListNode tail;
    Map<Integer, DoubleListNode> map = new HashMap<>();
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new DoubleListNode(0, 0);
        this.tail = new DoubleListNode(0, 0);
        this.head.prev = null;
        this.head.next = tail;
        this.tail.prev = head;
        this.tail.next = null;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        DoubleListNode node = map.get(key);
        int v = node.val;
        removeNode(node);
        addNode(node);
        return v;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DoubleListNode node = map.get(key);
            removeNode(node);
            node.val = value;
            addNode(node);
        }
        else {
            DoubleListNode node = new DoubleListNode(key, value);
            if (map.size() == this.capacity) {
                map.remove(tail.prev.key);
                removeNode(tail.prev);                   
            }
            addNode(node);
            map.put(key, node);
        }
    }
    
    public void addNode(DoubleListNode node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;        
    }
    
    public void removeNode(DoubleListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */