class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1Set = set(nums1)
        resultSet = set()
        for i in nums2:
            if i in nums1Set:
                resultSet.add(i)
        return list(resultSet)