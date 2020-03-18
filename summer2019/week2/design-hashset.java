class MyHashSet {
    int[] set;
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        set = new int[1000000];
    }
    
    public void add(int key) {
        if (set[key] == 0) {
            set[key]++;
        }
    }
    
    public void remove(int key) {
        if (set[key] > 0) { 
            set[key]--;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key] > 0;
    }
}