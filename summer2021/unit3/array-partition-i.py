class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        sortedNums = sorted(nums)
        maxSum = 0
        for i in range(len(nums)):
            if i % 2 == 0:
                maxSum += sortedNums[i]
        return maxSum