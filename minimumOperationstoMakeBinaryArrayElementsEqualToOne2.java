class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        boolean flip=false;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0 && !flip){
                flip=true;
           }
           else if(nums[i]==1 && flip){
                flip=false;
                count+=2;
           }
        }
        if(nums[nums.length-1]==0){
            count++;
        }
        return count;
    }
}
