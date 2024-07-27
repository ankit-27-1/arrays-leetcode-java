class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        long inc=0;
        long dec=0;
        long op=0;
        for(int i=0;i<nums.length;i++){
            int diff=target[i]-nums[i];
            if(diff>0){
                if(inc<diff){
                    op+=diff-inc;
                }
                inc=diff;
                dec=0;
            }
            else if(diff<0){
                if(diff<dec){
                    op+=dec-diff;
                }
                dec=diff;
                inc=0;
            }
            else{
                inc=dec=0;
            }
        }
        return op;
    }
}
