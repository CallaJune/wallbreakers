class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combine(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }
    
    public void combine(List<List<Integer>> result, List<Integer> current, int start, int n, int k) {
        // Once k reaches 0, k items have been added to current and current can be added to result
        // as a combination of size k, fulfilling the problem requirements
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Take turns adding each number to current
        for (int i = start; i <= n; i++) {
            // Add i to current
            current.add(i);
            // Current recurses forward, adding higher numbers if there is room,
            // stopping if not. Numbers that have already been visited are not
            // added because only higher numbers can be added. 
            combine(result, current, i + 1, n, k - 1);
            current.remove(current.size() - 1);
        }
    }
}