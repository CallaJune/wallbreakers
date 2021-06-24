class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        found = set()
        duplicated = 0
        for n in nums:
            if n in found:
                duplicated = n
            found.add(n)
                
        for i in range(1, len(nums) + 1):
            if i not in found:
                return [duplicated, i]