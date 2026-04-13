class Solution:
    def isHappy(self, n: int) -> bool:
        s = set()
        current_sum = n
        while current_sum != 1:
            if current_sum in s:
                return False
            s.add(current_sum)
            new_sum = 0
            while current_sum > 0:
                right = current_sum % 10
                new_sum += right * right
                current_sum //= 10
            current_sum = new_sum
        return True
