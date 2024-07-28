import java.util.Arrays;

class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        
        int h = horizontalCut.length - 1;
        int v = verticalCut.length - 1;
        
        long totalCost = 0;
        int horizontalSegments = 1;
        int verticalSegments = 1;
        
        while (h >= 0 && v >= 0) {
            if (horizontalCut[h] > verticalCut[v]) {
                totalCost += (long) horizontalCut[h] * verticalSegments;
                horizontalSegments++;
                h--;
            } else {
                totalCost += (long) verticalCut[v] * horizontalSegments;
                verticalSegments++;
                v--;
            }
        }
        
        while (h >= 0) {
            totalCost += (long) horizontalCut[h] * verticalSegments;
            h--;
        }
        
        while (v >= 0) {
            totalCost += (long) verticalCut[v] * horizontalSegments;
            v--;
        }
        
        return totalCost;
    }
}
