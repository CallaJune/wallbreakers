from collections import deque
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        queue = deque()
        for i in nums:
            queue.append(i)
        i = k % len(nums)
        while len(queue) > 0:
            nums[i] = queue.popleft()
            i = (i + 1) % len(nums)
        