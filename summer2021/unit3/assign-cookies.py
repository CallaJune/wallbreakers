class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g = sorted(g)
        s = sorted(s)
        
        child = 0
        cookie = 0
        while child < len(g) and cookie < len(s):
            # If the cookie satisfies the child, give the child the cookie
            if g[child] - s[cookie] <= 0:
                cookie += 1
                child += 1
            # Otherwise, the child needs a larger cookie, so move to the next cookie
            else:
                cookie += 1
        
        return child
        