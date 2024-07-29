class Solution {
    public int nonSpecialCount(int l, int r) {
        int l1=(int)Math.sqrt(l);
        int r1=(int)Math.sqrt(r);
        int p=0;
        if(l1*l1!=l){
            l1++;
        }
        int q= countPrimes(r1)-countPrimes(l1-1);
        return (r-l+1)-q;
    }
    public int countPrimes(int n){
        if(n==1 || n==0){
            return 0;
        }
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=0;
        Arrays.fill(arr,1);
        for(int i=2;i*i<=n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<arr.length;j+=i){
                    arr[j]=0;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}
