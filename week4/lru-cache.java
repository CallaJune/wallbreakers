class LRUCache {
    Queue<Integer> recentlyUsed;
    Map<Integer, Integer> map;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.recentlyUsed = new LinkedList<>();
        this.map = new HashMap<>();
    }
    
    public int get(int key) {
        if (this.map.containsKey(key)) {
            return this.map.get(key);   
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (!this.map.containsKey(key)) {
            // Check if cache full
            if (this.recentlyUsed.size() >= capacity) {
                int evict = this.recentlyUsed.remove();
                this.map.remove(evict);
                System.out.println("Evict: " + evict);
            }
            System.out.println("Put: " + key);
            // Add key and value to map
            this.map.put(key, value);
            this.recentlyUsed.add(key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */