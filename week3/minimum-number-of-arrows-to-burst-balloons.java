class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) {
            return points.length;
        }
        // Sort points by starting x-value
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
        // Set current to first interval in points
        int[] current = points[0];
        // Point next to second item in points
        int next = 1;
        int result = 1;
        // Iterate over intervals in points
        while (next < points.length) {
            // Check if current and next overlap
            if (current[1] >= points[next][0]) {
                current[0] = Math.max(current[0], points[next][0]);
                current[1] = Math.min(current[1], points[next][1]);
            } else {
                // Increment result
                result++;
                // Set current to next
                current = points[next];
            }
            next++; 
        }
        return result;
    }
}