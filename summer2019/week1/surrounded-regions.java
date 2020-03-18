class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int n = board.length;
        int m = board[0].length;
        UnionFind union_find = new UnionFind(n * m + 1);
        int root = n * m;
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (board[i][j] == 'X') {
                    continue;
                }
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    union_find.connect(i * m + j, root);
                }
                if (i > 0 && board[i - 1][j] == 'O') {
                    union_find.connect(i * m + j, (i - 1) * m + j);
                }
                if (j > 0 && board[i][j - 1] == 'O') {
                    union_find.connect(i * m + j, i * m + j - 1);
                }
            }
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (board[i][j] == 'O' && union_find.find(i * m + j) != root) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}

class UnionFind {
    int[] parent;
    int[] rank;
    public UnionFind(int x) {
        parent = new int[x];
        rank = new int[x];
        for (int i = 0; i < x; i++) {
            parent[i] = i;
        }
        rank[x - 1] = x;
    }
    
    public void connect(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) {
            return;
        }
        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else {
            if (rank[rootX] == rank[rootY]) {
                rank[rootX]++;
            }
            parent[rootY] = rootX;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}