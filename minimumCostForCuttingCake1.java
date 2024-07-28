class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int sum=0;
        for(int i=0;i<horizontalCut.length;i++){
            sum+=horizontalCut[i];
        }
        int v=0;
        for(int i=0;i<verticalCut.length;i++){
            sum+=verticalCut[i];
        }
        for(int i=0;i<horizontalCut.length;i++){
            for(int j=0;j<verticalCut.length;j++){
                sum+=Math.min(horizontalCut[i],verticalCut[j]);
            }
        }
        return sum;
    }
}
