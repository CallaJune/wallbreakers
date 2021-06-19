class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()
        result = n
        while result != 1:
            seen.add(result)
            
            current = result
            result = 0
            while current > 0:
                result += int(current % 10) * int(current % 10)
                current /= 10
                
            if result in seen:
                return False
        return True
    
    