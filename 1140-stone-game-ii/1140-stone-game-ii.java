class Solution {
    int n;
    int dp[][][];
    public int stoneGameII(int[] piles) {
        n=piles.length;
        dp=new int[2][n+1][n+1];
        for(int twod[][]:dp){
            for(int []row:twod){
                Arrays.fill(row,-1);
            }
        }
        return solve(1,0,1,piles);
    }
    int solve(int turn ,int ind, int M, int[]piles){
        if(ind>=n)return 0;
        if(dp[turn][ind][M]!=-1)return dp[turn][ind][M];
        int sum=0;
        int result=(turn==1)?0:Integer.MAX_VALUE;
        for(int x=1;x<=Math.min(n-ind,2*M);x++){
            sum+=piles[ind+x-1];
            if(turn==1)
            result=Math.max(result, sum+solve(0,ind+x,Math.max(M,x),piles));
            else
            result=Math.min(result,solve(1,ind+x,Math.max(M,x),piles));
        }
        return dp[turn][ind][M]=result;
    }
}