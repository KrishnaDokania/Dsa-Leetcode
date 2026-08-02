class Solution {
    int dp[][];
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int total=0;
        dp=new int [n][n];
        for(int pile:piles){
            total+=pile;
        }
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
         int alice=solve(0,n-1,piles);
         int bob=total-alice;
         return alice>bob;

    }
    int solve(int i,int j,int[]piles){
        if(i>j)return 0;
        if(i==j)return piles[i];
        if(dp[i][j]!=-1)return dp[i][j];
        int takei=piles[i]+Math.min(solve(i+1,j-1,piles),solve(i+2,j,piles));
        int takej=piles[j]+Math.min(solve(i+1,j-1,piles),solve(i,j-2,piles));
        return dp[i][j]=Math.max(takei,takej);
    }
}