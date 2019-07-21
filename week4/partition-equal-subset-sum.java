class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        // Set target to what the sum of each partition should be
        int target = sum / 2;
        // Create a memoization array with the answer 
        // for each number up to target
        boolean[] mem = new boolean[target + 1];
        // Set the first index to true
        mem[0] = true;
        // Iterate through each item in nums
        for(int i = 0; i < nums.length; i++) {
            // Iterate from target down to zero
            for(int j = target; j >= 0; j--) {
                // Check if the current j could be
                if(j - nums[i] >= 0) {
                    mem[j] = mem[j] || mem[j - nums[i]];
                }
            }
        }
        return mem[target];
    }
}