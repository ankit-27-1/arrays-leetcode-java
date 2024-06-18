class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[1001];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]]>0){
                arr[nums2[i]]--;
                list.add(nums2[i]);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
