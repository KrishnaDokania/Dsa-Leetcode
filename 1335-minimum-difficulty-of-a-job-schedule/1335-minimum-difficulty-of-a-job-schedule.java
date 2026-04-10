class Solution {
    int dp[][];
    public int minDifficulty(int[] j, int d) {
      int n=j.length;
        if(n<d)return-1;
        int sum=0;
         dp = new int[n][d + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        if(n==d){
            for(int i:j){
                sum+=i;
            }
            return sum;
        }
        return solve(0,n,d,j);
    }
    int solve(int index,int n,int d,int[]j){
            int max=j[index];
        if(d==1){
            for(int i=index;i<n;i++){
                max=Math.max(max,j[i]);
            }
            return max;
        }
        if(dp[index][d]!=-1)return dp[index][d];
        int finalmax=Integer.MAX_VALUE;
        for(int i=index;i<=n-d;i++){
            max=Math.max(max,j[i]);
            int result=max+solve(i+1,n,d-1,j);
            finalmax=Math.min(finalmax,result);
        }
        return dp[index][d]=finalmax;
    }
}