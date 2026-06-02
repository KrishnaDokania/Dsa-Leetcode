class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length-1; 
        int sum=0;
        while(n>=0){
            if(n-1>=0)
            sum+=cost[n]+cost[n-1];
            else
            sum+=cost[n];
            n-=3;
        }
        return sum;
    }
}