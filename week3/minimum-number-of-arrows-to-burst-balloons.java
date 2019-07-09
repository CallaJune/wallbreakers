class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) {
            return points.length;
        }
        // Sort points by ending x-value
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[1]));
        // Set current to first interval's end in points
        int current = points[0][1];
        // Point next to second item in points
        int next = 1;
        int result = 1;
        // Iterate over intervals in points
        while (next < points.length) {
            // Check if current and next overlap
            if (current >= points[next][0]) {
                next++;
                continue;
            }
            // Set current to next
            current = points[next][1];
            // Increment result
            result++;
            // Increment next
            next++;
        }
        return result;
    }
}