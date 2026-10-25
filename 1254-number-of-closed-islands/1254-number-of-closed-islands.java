class Solution {
    int n,m;
    public int closedIsland(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    if(solve(i,j,grid))
                    count++;
                }
            }
        }
        return count;
    }
    boolean solve(int i,int j,int[][]grid){
        if(i>=m ||i<0||j<0|| j>=n)return false;
        if(grid[i][j]==1)return true;
        grid[i][j]=1;
       boolean left= solve(i,j+1,grid);
    boolean down=solve(i+1,j,grid);
    boolean right= solve(i,j-1,grid);
    boolean top=solve(i-1,j,grid);
        return left&&right&&top&&down;
    }
}