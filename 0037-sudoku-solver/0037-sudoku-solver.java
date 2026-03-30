class Solution {
    public void solveSudoku(char[][] board) {
        generate(0,0,board);
    }
    boolean generate(int row, int col,char[][]board){
        if(row==9)return true;
        int newrow=row,newcol=col+1;
        if(newcol==9){
            newrow=row+1;
            newcol=0;
        }
        if(board[row][col]!='.'){
            return generate(newrow,newcol,board);
        }
        for(char i='1';i<='9';i++){
            if(check(board,row,col,i)){
                board[row][col]=i;
                if(generate(newrow,newcol,board))
                return true;
                board[row][col]='.';
        }
        }
        return false;
    }
    boolean check(char board[][],int row,int col,char digit){
        for(int i=0;i<9;i++)
        if(board[row][i]==digit)return false;
        for(int i=0;i<9;i++)
        if(board[i][col]==digit)return false;
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;
        for(int i=startrow;i<=startrow+2;i++)
        for(int j=startcol;j<=startcol+2;j++){
            if(board[i][j]==digit)return false;
        }
        return true;
    }
}