class Solution:
    def search(self, nums: List[int], target: int) -> int:
        return self.binary_search(target, 0, len(nums) - 1, nums)
    
    def binary_search(self, target, lo, hi, nums):
        mid = lo + int((hi - lo) / 2)
        if lo > hi:
            return -1
        elif nums[mid] == target:
            return mid
        elif target < nums[mid]:
            return self.binary_search(target, 0, mid - 1, nums)
        else:
            return self.binary_search(target, mid + 1, hi, nums)