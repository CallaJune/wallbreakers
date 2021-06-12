class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        result = []
        
        for i in range(1, n + 1):
            div_by_5 = False
            div_by_3 = False

            if i % 5 == 0:
                div_by_5 = True
            if i % 3 == 0:
                div_by_3 = True

            if div_by_5 and div_by_3:
                result.append("FizzBuzz")
                continue
            if div_by_3:
                result.append("Fizz")
                continue
            if div_by_5:
                result.append("Buzz")
            else:
                result.append(str(i))
        
        return result
        