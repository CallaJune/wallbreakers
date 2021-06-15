class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)
        lo = 0
        hi = len(nums) - 1
        
        for i in nums:
            if i % 2 == 0:
                result[lo] = i
                lo += 1
            else:
                result[hi] = i
                hi -= 1
        return result