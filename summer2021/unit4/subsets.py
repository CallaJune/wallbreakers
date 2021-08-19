class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        output = [[]]
        for num in nums:
            addition = []
            for curr in output:
                addition.append(curr + [num])
            output = output + addition
        return output
        