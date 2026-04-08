class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        self.plusOneHelper(digits, len(digits) - 1)
        return digits

    def plusOneHelper(self, digits: List[int], current: int):
        if digits[current] != 9:
            digits[current] = digits[current] + 1
        else:
            digits[current] = 0
            if current == 0:
                digits.insert(0, 1)
            else:
                self.plusOneHelper(digits, current - 1)
        