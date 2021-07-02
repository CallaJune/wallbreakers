class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        sortedNums = sorted(nums)
        save = None
        for i in sortedNums:
            if save == i:
                return save
            else:
                save = i
        