class Solution {
    int totalsum[];
    int dp[][];
    public int stoneGameVII(int[] stones) {
        int n=stones.length;
        dp=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        totalsum=new int[n];
        totalsum[0]=stones[0];
        for(int i=1;i<n;i++){
            totalsum[i]=totalsum[i-1]+stones[i];
        }
        return solve(0,n-1,stones);
    }
    int solve(int i,int j,int[]stones){
        if(i==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int total = totalsum[j] - (i > 0 ? totalsum[i - 1] : 0);
        int takefront=total-stones[i]-solve(i+1,j,stones);
        int takeback=total-stones[j]-solve(i,j-1,stones);
        return dp[i][j]=Math.max(takefront,takeback);
    }
}