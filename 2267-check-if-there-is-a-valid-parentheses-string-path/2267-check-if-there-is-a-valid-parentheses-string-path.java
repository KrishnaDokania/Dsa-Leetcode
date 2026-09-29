class Solution {
    int n;
    int m;
    Boolean dp[][][];
    public boolean hasValidPath(char[][] grid) {
        m=grid[0].length;
        n=grid.length;
        dp=new Boolean[n][m][201];
        if((n+m-1)%2==1)return false;
        if(grid[0][0]==')'|| grid[n-1][m-1]=='(')return false;
        return solve(0,0,grid,0);
    }
    boolean solve(int i,int j,char[][]grid,int open){
        open +=(grid[i][j]=='(')?1:-1;
        if(open<0)return false;
        if(i==n-1 && j==m-1)
        return open==0;
        if(dp[i][j][open]!=null)return dp[i][j][open];
        if(i+1<n && solve(i+1,j,grid,open))
        return dp[i][j][open]=true;
        if(j+1<m && solve(i,j+1,grid,open))
        return dp[i][j][open]=true;
        return dp[i][j][open]= false;
    }
}