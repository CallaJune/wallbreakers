class Solution {
    /* Each node will have a color of 0 (unset), 1, or -1. 
     */
    public boolean isBipartite(int[][] graph) {
        int edges = graph.length;
        int[] colors = new int[edges];
        for (int i = 0; i < edges; i++) {
            if (colors[i] == 0 && !dfs(graph, i, colors, 1)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int[][] graph, int i, int[] colors, int color) {
        // The color we want to try and color the next node
        colors[i] = color;
        for (int edge : graph[i]) {
            // If the edges we're trying to color are the same color
            // as our current node, return false
            if (colors[edge] == color) {
                return false;
            }
            // If color hasn't been set and color can't be set, return false
            if (colors[edge] == 0 && !dfs(graph, edge, colors, -color)) {
                return false;
            }
        }
        return true;
    }
}