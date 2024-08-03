class Solution {
    public int minFlips(int[][] grid) {
        return Math.min(rowFlips(grid),colFlips(grid));
    }
    public int rowFlips(int[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int p=0,j=grid[0].length-1;p<grid[0].length/2;p++,j--){
                if(grid[i][p]!=grid[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public int colFlips(int[][] grid){
        int count=0;
        for(int i=0;i<grid[0].length;i++){
            for(int p=0,j=grid.length-1;p<grid.length/2;p++,j--){
                if(grid[p][i]!=grid[j][i]){
                    count++;
                }
            }
        }
        return count;
    }
}
