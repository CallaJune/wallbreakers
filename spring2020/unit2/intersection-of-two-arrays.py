class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums = set(nums1)
        res = set()
        for i in nums2:
            if i in nums:
                res.add(i)
        return list(res)
