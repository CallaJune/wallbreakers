class Solution {
    /* This problem was essentially Course Schedule, but with the understanding that
     * items are added to 'visited' in reverse topological sort order.
     */
    List<Integer> taken;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        taken = new ArrayList<>();
        int[] dummy = new int[0];
        if (prerequisites.length == 0) {
            dummy = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                dummy[i] = i;
            }
            return dummy;
        }
        if (canFinish(numCourses, prerequisites)) {
            // Convert arraylist to array
            int[] result = new int[taken.size()];
            for (int i = taken.size() - 1; i >= 0; i--) {
                result[i] = taken.get(taken.size() - 1 - i);
            }
            return result;
        } else {
            return dummy;
        }
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0) {
            return true;
        }
        Set<Integer> visiting = new HashSet<>();
        boolean[] visited = new boolean[numCourses];
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
    
    // Return true if a cycle is found
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
        taken.add(node);
        return false;
    }
}