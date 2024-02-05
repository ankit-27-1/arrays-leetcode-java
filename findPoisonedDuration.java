class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int temp=timeSeries[i];
            int temp2=duration;
            while(timeSeries[i+1]!=temp && temp2>0){
                temp2--;
                count++;
                temp++;
            }
        }
        return count+duration;
    }
}
