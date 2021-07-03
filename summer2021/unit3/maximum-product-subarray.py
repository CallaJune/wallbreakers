import sys

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return nums[0]
        
        currentMax = nums[0]
        currentMin = nums[0]
        result = nums[0]
        
        for i in range(1, len(nums)):
            current = nums[i]
            tempMax = max(current, currentMax * current, currentMin * current)
            currentMin = min(current, currentMax * current, currentMin * current)
            
            currentMax = tempMax
            
            result = max(currentMax, result)
        return result