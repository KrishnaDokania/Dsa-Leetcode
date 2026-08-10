class Solution {
        boolean dp[];
    public boolean winnerSquareGame(int n) {
        dp=new boolean[n+1];
        return solve(n);
    }
    boolean solve(int n){
        if(n==0)return false;
        if(dp[n]!=false)return dp[n];
        for(int k=1;k*k<=n;k++){

        if(solve(n-k*k)==false){
            return dp[n]=true;
        }
            
        }
        return false;
    }
}