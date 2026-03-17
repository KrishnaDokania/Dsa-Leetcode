class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>>ans= new ArrayList<>();
         char board[][]=new char[n][n];
             for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

         queen(n,0,board,ans);
         return ans;
    }
    void queen(int n,int row,char board[][],  List<List<String>>ans){
        if(row==n){
           List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
            }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,n)){
                board[row][j]='Q';
                queen(n,row+1,board,ans);
                board[row][j]='.';
            }
        }

    }
    boolean isSafe(char board[][],int row,int col ,int n){
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