class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j];
            if(j<n-1){
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}