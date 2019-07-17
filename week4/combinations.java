// Not finished
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        List<List<Integer>> result = new ArrayList<>();
        combine(result, new ArrayList<Integer>(), nums, k);
        return result;
    }
    
    public void combine(List<List<Integer>> result, List<Integer> current, int[] nums, int size) {
        // Iterate through all items in nums
        for (int num : nums) {
            // If all subsets of size 'size' have been added, return
            if (current.size() == size) {
                result.add(new ArrayList<>(current));
                return;
            }
            // If current subset already contains num, don't add it again
            if (current.contains(num)) {
                continue;
            }
            // If current does not yet contain num, add num to current
            current.add(num);
            // All remaining items in nums will be permuted and 
            // items in num already in current, bypassed
            combine(result, current, nums, size);
            // Remove num from its place in current so that it can be added
            // in other permutations in different indices
            current.remove(current.size() - 1);
        } 
    }
}