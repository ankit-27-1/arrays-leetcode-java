class Solution {
    public int distributeCandies(int[] candyType) {
        int max=1;
        Arrays.sort(candyType);
        for(int i=0;i<candyType.length-1;i++){
            if(candyType[i]!=candyType[i+1]){
                max++;
            }
        }

        if(max>=candyType.length/2){
            return candyType.length/2;
        }
        else{
            return max;
        }
    }
}
