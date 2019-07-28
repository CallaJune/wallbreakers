class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0) {
            return true;
        }
        Set<Integer> visiting = new HashSet<>();
        boolean[] visited = new boolean[numCourses];
        /* Dependency list for each course
         * Key: course
         * Value: list of courses that are prerequisites to the course key
         */
        HashMap<Integer, List<Integer>> depList = new HashMap<>();
        for (int[] group : prerequisites) {
            if (depList.containsKey(group[1])) {
                depList.get(group[1]).add(group[0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(group[0]);
                depList.put(group[1], list);
            }
        }
        
        for (int node = 0; node < numCourses; node++) {
            // If a cycle is found, return false
            if (hasCycle(node, depList, visiting, visited)) {
                return false;
            }
        }
        return true;
    }
    
    /* Returns true if a cycle is found
     * On a high level, this depth first search (dfs) method picks a node, adds it to
     * set of nodes we are "visiting" in this dfs, and runs a dfs on each of that nodes
     * neighbors after adding the current node (parent of those neighbors) to "visiting."
     * In the course of this dfs, if we see any of the ancestor nodes previously visited
     * in the search, we have found a cycle. 
     */
    public boolean hasCycle(int node, HashMap<Integer, List<Integer>> depList, Set<Integer> visiting, boolean[] visited) {
        // If we are already visiting this node, there is a cycle
        if (visiting.contains(node)) {
            return true;
        }
        
        // If we have seen the node already, backtrack; we've already done this work
        if (visited[node]) {
            return false;
        }
        
        // Start visiting the current node
        visiting.add(node);
        
        // Do the same for all prereqs
        if (depList.containsKey(node)) {
            for (int p : depList.get(node)) {
                if (hasCycle(p, depList, visiting, visited)) {
                    return true;
                }
            }   
        }
        
        visiting.remove(node);
        visited[node] = true;
        return false;
    }
}