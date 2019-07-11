import java.util.Arrays;
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robHouses(Arrays.copyOfRange(nums, 0, nums.length - 1)), robHouses(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    // Recursive solution to House Robber:
    // https://leetcode.com/problems/house-robber/description/
    public int robHouses(int[] nums) {
        return robHouse(nums, nums.length - 1);
    }
    
    // Recursive solution to House Robber - helper function:
    // https://leetcode.com/problems/house-robber/description/
    public int robHouse(int[] nums, int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return nums[0];
        } else if (n == 1) {
            return Math.max(nums[0], nums[1]);
        }
        // Choose current house and house two houses away
        // or previous house
        return Math.max(nums[n] + robHouse(nums, n - 2), robHouse(nums, n - 1));
    }
    
    // Dynamic programming solution to House Robber:
    // https://leetcode.com/problems/house-robber/description/
    public int robHouses(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] mem = new int[nums.length];
        mem[0] = nums[0];
        mem[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            // Choose current house and house two houses away
            // or previous house
            mem[i] = Math.max(nums[i] + mem[i - 2], mem[i - 1]);
        }
        return mem[nums.length - 1];
    }
}