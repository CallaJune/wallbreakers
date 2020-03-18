class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        UnionFind union_find = new UnionFind(n * m);
        int total = 0;
        
        // Get the number of 1s
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '1')
                    total++;
            }
        }
        
        union_find.set_count(total);
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    if (i > 0 && grid[i - 1][j] == '1') {
                        union_find.connect(i * m + j, (i - 1) * m + j);
                    }
                    if (j > 0 && grid[i][j - 1] == '1') {
                        union_find.connect(i * m + j, i * m + j - 1);
                    }
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