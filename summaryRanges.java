class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(curr==nums[i]){
                list.add(Integer.toString(curr));
            }
            else{
                list.add(Integer.toString(curr)+"->"+Integer.toString(nums[i]));
            }
        }
        return list;
    }
}
