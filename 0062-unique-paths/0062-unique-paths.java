class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int row[]:dp)
            Arrays.fill(row,-1);
        return generate(0,0,m,n,dp);
    }
    int generate(int i,int j,int m,int n ,int[][]dp ){
        if(i==m-1&& j==n-1)
        return 1;
        if(i>=m||j>=n||i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=generate(i,j+1,m,n,dp)+generate(i+1,j,m,n,dp);

    }
}