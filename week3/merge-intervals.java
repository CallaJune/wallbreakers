class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        int current = 0;
        int next = 1;
        int pointer = 0;
        int merges = 0;
        while (next < intervals.length) {
            if (intervals[next][0] <= intervals[current][1]) {
                int[] merge = {Math.min(intervals[next][0], intervals[current][0]), Math.max(intervals[next][1], intervals[current][1])};
                intervals[current] = new int[0];
                intervals[next] = merge;
                merges++;
            }
            current++;
            next++;
        }
        int[][] result = new int[intervals.length - merges][2];
        int p = 0, r = 0;
        while (r < result.length) {
            if (intervals[p].length != 0) {
                result[r++] = intervals[p];
            }
            p++;
        }
        return result;
    }
}