class Solution {
    int prefix[];
    int n;
    int dp[];
    public int stoneGameVIII(int[] stones) {
        n=stones.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        prefix=new int[n];
        prefix[0]=stones[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+stones[i];
        }
        return solve(1);
    }
    int solve(int i){
        if(i==n-1)return prefix[i];
        if(dp[i]!=-1)return dp[i];
        int next=solve(i+1);
        return dp[i]=Math.max(prefix[i]-next,next);
    }
}