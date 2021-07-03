class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        elif len(nums) == 2:
            return max(nums[0], nums[1])
        return max(self.robHouses(nums[:-1]), self.robHouses(nums[1:]))
    
    def robHouses(self, nums: List[int]) -> int:
        mem = [nums[0], max(nums[0], nums[1])]
        return self.rob_m(nums, mem, 2)
    
    # Using memoization
    def rob_m(self, nums, mem, current) -> int:
        if current == len(nums):
            return mem[-1]
        mem.append(max(nums[current] + mem[-2], mem[-1]))
        return self.rob_m(nums, mem, current + 1)