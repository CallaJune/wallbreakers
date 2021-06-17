class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        result = []
        carry = 1
        for i in digits[::-1]:
            add_one = i + carry
            if add_one >= 10:
                carry = 1
                result.insert(0, 0)
            else:
                result.insert(0, add_one)
                carry = 0
        if carry > 0:
            result.insert(0, carry)
        return result