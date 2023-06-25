class leftRightSum {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum=sum+nums[j];
            }
            arr[i]=sum;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum=sum+nums[j];
            }
            arr1[i]=sum;
        }
        for(int i=0;i<n;i++){
            arr2[i]=arr[i]-arr1[i];
        }
        for(int i=0;i<n;i++){
            if(arr2[i]<0){
                arr2[i]=-arr2[i];
            }
        }
        return arr2;
    }
}
