class Solution {
    int n,m;
    void count(int i,int j,char [][]grid,boolean vis[][]){
        if(i<0||j<0||i>=m||j>=n||grid[i][j]=='0'||vis[i][j])return;
        vis[i][j]=true;
        count(i-1,j,grid,vis);
        count(i,j+1,grid,vis);
        count(i+1,j,grid,vis);
        count(i,j-1,grid,vis);
    }
    public int numIslands(char[][] grid) {
       int island=0;
       m=grid.length;
       n=grid[0].length;
       boolean vis[][]=new boolean[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]=='1'&& !vis[i][j]){
                count(i,j,grid,vis);
                island++;
            }
        }
       }
       return island;
    }
}