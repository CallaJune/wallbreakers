class Solution {
    public int findCircleNum(int[][] M) {
        UnionFind union_find = new UnionFind(M.length);
        union_find.set_count(M.length);
        
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[0].length; j++) {
                if(M[i][j] == 1) {
                    union_find.connect(i, j);
                }
            }
        }
        
        return union_find.get_count();
    }
}

class UnionFind {
    private int[] parent = null;
    private int count;
    
    public UnionFind(int n){
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }
    
    public void connect(int a, int b){
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b){
            parent[root_a] = root_b;
            count--;
        }
    }
    
    private int find(int x){
        if (parent[x] == -1) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    
    public int get_count(){
        return count;
    }
    
    public void set_count(int total){
        count = total;
    }
}