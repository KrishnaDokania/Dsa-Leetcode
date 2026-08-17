class Solution {
    int totalsum[];
    int dp[][];
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new int [n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        totalsum=new int[n];
        totalsum[0]=stoneValue[0];
        for(int i=1;i<n;i++){
            totalsum[i]=totalsum[i-1]+stoneValue[i];
        }
           return solve(0,n-1);
    }
    int solve(int l,int r){
        if(l>=r)return 0;
        if(dp[l][r]!=-1)return dp[l][r];
        int score=0; 
        for(int mid=l;mid<r;mid++){
            int leftsum=totalsum[mid]-((l-1)>=0?totalsum[l-1]:0);
            int rightsum=totalsum[r]-totalsum[mid];
            if(leftsum<rightsum){
                score=Math.max(score,leftsum+solve(l,mid));
            }
            else if(rightsum<leftsum){
                score=Math.max(score,rightsum+solve(mid+1,r));
            }
            else
             score=Math.max(score,Math.max(leftsum+solve(l,mid),rightsum+solve(mid+1,r)));
        }
        return dp[l][r]=score;
    }
}