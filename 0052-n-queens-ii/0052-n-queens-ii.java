class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(board[i],'.');
        return queen(board,n,0); 
    }
    int queen(char board[][],int n,int row){
        if(row==n){
            return 1;
        }
        int count=0;
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                count+=queen(board,n,row+1);
                board[row][col]='.';
            }
        }
        return count;
    }
    boolean isSafe(char board[][],int row, int col,int n){
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q')return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
         for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
}