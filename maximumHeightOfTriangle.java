class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int height1=solve(red,blue);
        int height2=solve(blue,red);
        return Math.max(height1,height2);
    }
    public int solve(int a,int b){
        int height=0;
        int aCount=1;
        int bCount=2;
        while(true){
            a=a-aCount;
            aCount+=2;
            if(a>=0){
                height++;
            }
            else{
                break;
            }
            b=b-bCount;
            bCount+=2;
            if(b>=0){
                height++;
            }
            else{
                break;
            }
        }
        return height;
    }
}
