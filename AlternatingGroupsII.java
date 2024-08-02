class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count=0;
        int max=1;
        for(int i=0;i<n-1+k-1;i++){
            if(colors[i%n]!=colors[(i-1+n)%n]){
                max++;
            }
            else{
                max=1;
            }
            if(max>=k){
                count++;
            }
        }
        return count;
    }
}
