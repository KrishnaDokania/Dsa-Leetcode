class Solution {
    int m,n;
    public int countIslands(int[][] grid, int k) {
        m=grid.length;
        n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                if(solve(i,j,grid)%k==0)count++;
            }
            }
        }
        return count;
    }
    long solve(int i,int j,int grid[][]){
        if(i>=m||i<0||j<0||j>=n)return 0;
        if(grid[i][j]==0)return 0;
        long val=grid[i][j];
        grid[i][j]=0;
        val+=solve(i,j+1,grid);
        val+=solve(i+1,j,grid);
        val+=solve(i,j-1,grid);
        val+=solve(i-1,j,grid);
        return val;
    }
}