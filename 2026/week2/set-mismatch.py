class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums_counter = Counter(nums)
        top = len(nums)
        res = [0, 0]
        for i in range(1, top + 1):
            if i not in nums_counter:
                res[1] = i
            elif nums_counter[i] == 2:
                res[0] = i
        return res
