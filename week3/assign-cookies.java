class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numContent = 0;
        int child = 0;
        int cookie = 0;
        while (cookie < s.length && child < g.length) {
            if (g[child] <= s[cookie]) {
                child++;
                numContent++;
            }
            cookie++;
        }
        return numContent;
    }
}