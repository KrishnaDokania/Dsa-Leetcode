class Solution {
        int dp[][];
        int m;
        int n;
    public int numDistinct(String s, String t) {
        n=s.length();
        m =t.length();
        dp=new int[n][m];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return solve(s,t,0,0);
    }
    int solve(String s, String t, int i,int j){
        if(j==m)return 1;
        if(i==n)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=0;
        if(s.charAt(i)==t.charAt(j))
        ans+=solve(s,t,i+1,j+1);
        ans+=solve(s,t,i+1,j);
        return dp[i][j]=ans;   
         }
}