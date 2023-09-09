class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(nums[0]>target){
            return 0;
        }
        if(nums[n-1]<target){
            return n;
        }
        if(nums[0]==target){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(nums[i-1]<target && target<=nums[i]){
                return i;
            }
        }
        return -1;
    }
}
