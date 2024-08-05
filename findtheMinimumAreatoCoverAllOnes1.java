class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int a=Integer.MIN_VALUE;
        int c=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        int d=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    a=Math.max(i,a);
                    b=Math.max(j,b);
                    c=Math.min(i,c);
                    d=Math.min(j,d);
                }
            }
        }
        if(a==0 && b==0 && c==0 && d==0){
            return 1;
        }
        int l=a-c+1;
        int w=b-d+1;
        return l*w;
    }
}
