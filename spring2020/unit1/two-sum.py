class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i in range(len(nums)):
            d[nums[i]] = i

        for i in range(len(nums)):
            if target - nums[i] in d and d[target - nums[i]] != i:
                return [d[target - nums[i]], i]
        return []
