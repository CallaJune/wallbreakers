class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }
        int target = sum / k;
        return canPartitionKSubsets(nums, k, new boolean[nums.length], 0, target, nums.length - 1);
    }
    
    public boolean canPartitionKSubsets(int[] nums, int k, boolean[] visited, int sum, int target, int index) {
        if (k == 0) {
            return true;
        }
        
        // If the sum equals the target, we can reset the sum to 0 and start 
        // calculating the sum again
        if (sum == target) 
            return canPartitionKSubsets(nums, k - 1, visited, 0, target, nums.length - 1);
        
        for (int i = index; i >= 0; i--) {
            // Continue if we have visited this index
            if (visited[i] || sum + nums[i] > target) {
                continue;
            }
            
            // Visit the index
            visited[i] = true;
            if (canPartitionKSubsets(nums, k, visited, sum + nums[i], target, i - 1)) {
                return true;
            }
            
            // Backtrack and unvisit selection because a solution was not possible
            visited[i] = false;
        }
        
        return false;
    }
}