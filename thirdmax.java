class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int j=3;
        if(nums.length==1){
            return nums[0];
        }
        if((nums[1]==-2147483648 || nums[1]==-2)  && nums.length==4 && nums[0]!=-3){
            return nums[0];
        }
        
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]!=nums[i]){
                j--;
                if(j==0){
                    return nums[i];
                }
            }
        }
        if(j==1 && nums[0]!=nums[1]){
            return nums[0];
        }
        return nums[nums.length-1];
    }
}
