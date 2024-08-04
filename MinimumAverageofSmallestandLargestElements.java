class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        float min=Integer.MAX_VALUE;
        for(int i=0,j=nums.length-1;i<nums.length/2;i++,j--){
            float p=(float)(nums[i]+nums[j])/2;
            min=Math.min(min,p);
        }
        return min;
    }
}
