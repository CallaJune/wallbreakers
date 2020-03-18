class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, new ArrayList<Integer>(), nums);
        return result;
    }
    
    public void permute(List<List<Integer>> result, List<Integer> current, int[] nums) {
        // Iterate through all items in nums
        for (int num : nums) {
            // Once current has all items in nums, it is completed and can be added to result
            if (current.size() == nums.length) {
                result.add(new ArrayList<>(current));
                return;
            }
            // If current already contains num, don't add it again
            if (current.contains(num)) {
                continue;
            }
            // If current does not yet contain num, add num to current
            current.add(num);
            // Permute using the updated current list, meaning all remaining items in nums
            // will be permuted and items in num already in current, bypassed
            permute(result, current, nums);
            // Remove num from its place in current so that it can be added
            // in other permutations in different indices
            current.remove(current.size() - 1);
        } 
    }
}