class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans=new int[img.length][img[0].length];
        if(img.length==1 && img[0].length==1){
            return img;
        }
        if(img.length!=1 && img[0].length==1){
            for(int i=0;i<img.length;i++){
                if(i==0){
                    ans[0][0]=img[0][0]+img[1][0];
                    ans[0][0]=ans[0][0]/2;
                }
                else if(i==img.length-1){
                    ans[i][0]=img[i][0]+img[i-1][0];
                    ans[i][0]=ans[i][0]/2;
                }
                else{
                    ans[i][0]=img[i-1][0]+img[i][0]+img[i+1][0];
                    ans[i][0]=ans[i][0]/3;
                }
            }
            return ans;
        }
        if(img.length==1 && img[0].length!=1){
            for(int j=0;j<img[0].length;j++){
                if(j==0){
                    ans[0][0]=img[0][1]+img[0][0];
                    ans[0][0]=ans[0][0]/2;
                }
                else if(j==img[0].length-1){
                    ans[0][j]=img[0][j]+img[0][j-1];
                    ans[0][j]=ans[0][j]/2;
                }
                else{
                    ans[0][j]=img[0][j-1]+img[0][j]+img[0][j+1];
                    ans[0][j]=ans[0][j]/3;
                }
            }
            return ans;
        } 
        if(img[0].length==2){
            for(int i=0;i<img.length;i++){
                for(int j=0;j<img[0].length;j++){
                    if(i!=0 && i!=img.length-1 && j==0){
                        ans[i][j]=img[i-1][j]+img[i-1][j+1]+img[i][j]+img[i][j+1]+img[i+1][j]+img[i+1][j+1];
                        ans[i][j]=ans[i][j]/6;
                    }
                    else if(i!=0 && j==1 && i!=img.length-1){
                        ans[i][j]=img[i-1][j-1]+img[i-1][j]+img[i][j-1]+img[i][j]+img[i+1][j-1]+img[i+1][j];
                        ans[i][j]=ans[i][j]/6;
                    }
                    else if(i==0 && j==0){
                        ans[i][j]=img[i][j]+img[i+1][j]+img[i][j+1]+img[i+1][j+1];
                        ans[i][j]=ans[i][j]/4;
                    }
                    else if(i==0 && j==img[0].length-1){
                        ans[i][j]=img[i][j]+img[i][j-1]+img[i+1][j-1]+img[i+1][j];
                        ans[i][j]=ans[i][j]/4;
                    }
                    else if(i==img.length-1 && j==0){
                        ans[i][j]=img[i-1][j]+img[i][j]+img[i-1][j+1]+img[i][j+1];
                        ans[i][j]=ans[i][j]/4;           
                    }
                    else if(i==img.length-1 && j==img[0].length-1){
                        ans[i][j]=img[i][j]+img[i-1][j]+img[i-1][j-1]+img[i][j-1];
                        ans[i][j]=ans[i][j]/4;
                    }
                }
            }
            return ans;
        }
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
               if(i!=0 && j!=0 && i!=img.length-1 && j!=img[0].length-1){
                    ans[i][j]=img[i-1][j-1]+img[i-1][j]+img[i-1][j+1]+img[i][j-1]+img[i][j]+img[i][j+1]+img[i+1][j-1]+img[i+1][j]+img[i+1][j+1];
                    ans[i][j]=ans[i][j]/9;
               }
               else if(i==0 && j!=0 && j!=img[0].length-1){
                   ans[i][j]=img[i][j-1]+img[i][j]+img[i][j+1]+img[i+1][j-1]+img[i+1][j]+img[i+1][j+1];
                   ans[i][j]=ans[i][j]/6;
               }
                else if(i==img.length-1 && j!=0 && j!=img[0].length-1){
                    ans[i][j]=img[i][j-1]+img[i][j]+img[i][j+1]+img[i-1][j-1]+img[i-1][j]+img[i-1][j+1];
                    ans[i][j]=ans[i][j]/6;
                }
                else if(i!=0 && i!=img.length-1 && j==0){
                    ans[i][j]=img[i-1][j]+img[i][j]+img[i+1][j]+img[i-1][j+1]+img[i][j+1]+img[i+1][j+1];
                    ans[i][j]=ans[i][j]/6;
                }
                else if(i!=0 && i!=img.length-1 && j==img[0].length-1){
                    ans[i][j]=img[i-1][j]+img[i][j]+img[i+1][j]+img[i-1][j-1]+img[i][j-1]+img[i+1][j-1];
                    ans[i][j]=ans[i][j]/6;
                }
                else if(i==0 && j==0){
                    ans[i][j]=img[i][j]+img[i+1][j]+img[i][j+1]+img[i+1][j+1];
                    ans[i][j]=ans[i][j]/4;
                }
                else if(i==0 && j==img[0].length-1){
                    ans[i][j]=img[i][j]+img[i][j-1]+img[i+1][j-1]+img[i+1][j];
                    ans[i][j]=ans[i][j]/4;
                }
                else if(i==img.length-1 && j==0){
                    ans[i][j]=img[i-1][j]+img[i][j]+img[i-1][j+1]+img[i][j+1];
                    ans[i][j]=ans[i][j]/4;           
                }
                else if(i==img.length-1 && j==img[0].length-1){
                    ans[i][j]=img[i][j]+img[i-1][j]+img[i-1][j-1]+img[i][j-1];
                    ans[i][j]=ans[i][j]/4;
                }
            } 
        }
        return ans;  
    }
}
