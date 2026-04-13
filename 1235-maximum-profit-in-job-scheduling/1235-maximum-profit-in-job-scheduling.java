class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int job[][]=new int [n][3];
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            job[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(job,(a,b)->a[0]-b[0]);
        return solve(0,job,dp);
    }
    int solve(int i,int[][] job,int[]dp){
        if(i>=job.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int exclude=solve(i+1,job,dp);
        int next=nextjob(i,job);
        int include=job[i][2]+solve(next,job,dp);
        return dp[i]=Math.max(include,exclude);
    }
    int nextjob(int i,int[][]job){
        int left=i+1;int right=job.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(job[mid][0]>=job[i][1])right=mid-1;
            else
            left=mid+1;
        }
        return left;
    }
}