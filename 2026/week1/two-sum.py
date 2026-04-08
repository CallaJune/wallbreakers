class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i in range(len(nums)):
            needed_number = target - nums[i]
            if needed_number in d:
                return [i, d[needed_number]]
            d[nums[i]] = i