class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsets(result, new ArrayList<Integer>(), nums, -1);
        return result;
    }
    
    public void subsets(List<List<Integer>> result, List<Integer> current, int[] nums, int index) {
        // Add the current list being built to the result
        result.add(new ArrayList<>(current));
        
        // Add each subsequent item in nums to current,
        // and current including that item will be added to the result
        for (int i = index + 1; i <= nums.length - 1; i++) {
            // Add the ith item in nums too current
            current.add(nums[i]);
            // Recurse current including nums[i] forward so that all
            // subsequent items in nums will take turns being added
            subsets(result, current, nums, i);
            // Remove ith number in nums so that future subsets will not include
            // that item. 
            current.remove(current.size() - 1);
        }
    }
}

/* Note: what differentiates this from the permutations problem in permutations.java
 * lie in lines 10 and 14. In permutations, we add the current list to the result only once
 * it contains all items in nums. Here, we include the current subset in the result
 * before doing any additional work as it is already a valid subset.
 * In line 14, we only iterate over all items that come after the current subset's size.
 * We begin at -1 because the first time subsets is called, all that is added is an
 * empty array list. Thus, we want to go through and add each item in nums individually
 * to the empty array list, and add these to the result. When we first call subsets 
 * recursively (assuming that nums.length > 2), current is an array list containing one item.
 * This item is added to the result set (because an array list containing only that item is a 
 * valid subset), and then we add the next item in nums (by starting at index + 1 in nums)
 * to the subset before continuing the process. We do not add duplicate items to our subset
 * lists because we only add items in nums that come after previously added items.
 *
 */