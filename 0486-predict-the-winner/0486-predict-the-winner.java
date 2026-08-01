class Solution {
    int p1;
    int p2;
    int dp[][]; 
    public boolean predictTheWinner(int[] nums) {
        int total=0;
        dp=new int[nums.length][nums.length];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        for(int num:nums){
            total+=num;
        }

        p1=solve(0,nums.length-1,nums);
        p2=total-p1;
        return p1>=p2;
    }
    int solve(int i,int j,int[]nums){
        if(i>j)return 0;
        if(i==j)return nums[i];
        if(dp[i][j]!=-1)return dp[i][j];
        int takei=nums[i]+Math.min(solve(i+1,j-1,nums),solve(i+2,j,nums));
        int takej=nums[j]+Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));
        return dp[i][j]=Math.max(takei,takej);
    }
}