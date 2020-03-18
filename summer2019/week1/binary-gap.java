class Solution {
    public int binaryGap(int N) {
        int distance = -1;
        int maxDistance = 0;
        while (N > 0) {
            if (distance >= 0) {
                distance++;
            }
            if ((N & 1) == 1) {
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
                distance = 0;
            }
            N >>= 1;
        }
        return maxDistance;
    }
}