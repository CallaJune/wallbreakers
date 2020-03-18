class Solution {
    public int peakIndexInMountainArray(int[] A) {
        return peakSearch(A, 0, A.length - 1);
    }
    
    public int peakSearch(int[] A, int lo, int hi) {
        if (lo >= hi) {
            return lo;
        }
        int mid = lo + (hi - lo) / 2;
        // We are on the ascending side of the mountain
        if (A[mid] < A[mid + 1]) {
            return peakSearch(A, mid + 1, hi);
        // We are on the descending side of the mountain
        } else {
            return peakSearch(A, lo, mid);
        }
    }
}