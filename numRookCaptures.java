class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        int m=0;;
        int n=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    m=i;
                    n=j;
                }
            }
        }
        for(int i=m;i>=0;i--){
            if(board[i][n]=='B'){
                break;
            }
            if(board[i][n]=='p'){
                count++;
                break;
            }
        }
        for(int i=m;i<board.length;i++){
            if(board[i][n]=='B'){
                break;
            }
            if(board[i][n]=='p'){
                count++;
                break;
            }
        }
        for(int i=n;i>=0;i--){
            if(board[m][i]=='B'){
                break;
            }
            if(board[m][i]=='p'){
                count++;
                break;
            }
        }
        for(int i=n;i<board.length;i++){
            if(board[m][i]=='B'){
                break;
            }
            if(board[m][i]=='p'){
                count++;
                break;
            }
        }
        return count;
    }
}
