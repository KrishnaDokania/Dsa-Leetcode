class Solution {
    public boolean exist(char[][] board, String word) {
      
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0) && find(i,j,0,board,word))
            return true;
            }
        }
        return false;
    }
    boolean find(int i,int j, int index,char[][] board, String word){
            int[][] direction = {{0,1},{1,0},{-1,0},{0,-1}};

        if(index==word.length())return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(index))
        return false;
        char tmp=board[i][j];
        board[i][j]='#';
        for(int[]dir:direction){
            int ii=i+dir[0];
            int jj=j+dir[1];
            if(find(ii,jj,index+1,board,word))return true;
        }
        board[i][j]=tmp;
        return false;
        
    }
}