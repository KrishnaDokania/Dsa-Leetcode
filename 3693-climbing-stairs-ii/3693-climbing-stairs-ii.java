class Solution {
    int n;
    int dp[];
    public int climbStairs(int n, int[] costs) {
        this.n=n;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,costs);
    }
    int solve(int i,int costs[]){
        if(i==n)return 0;
        if(dp[i]!=-1)return dp[i];
        int result=Integer.MAX_VALUE;
        for(int ind=1;ind<=3;ind++){
        int j=ind+i;
        if(j<=n){
          result=Math.min(result,(costs[j-1]+ind*ind)+solve(j,costs));
        }
        }
        return dp[i]=result;
        }
}