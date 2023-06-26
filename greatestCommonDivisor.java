class greatestCommonDivisor {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(nums[n-1]%nums[0]==0){
            return nums[0];
        }
        else if(nums[n-1]%nums[0]!=0){
            for(int i=nums[0];i>=2;i--){
                if(nums[n-1]%i==0 && nums[0]%i==0){
                    return i;
                }
            }
        }
            return 1;

    }
}
