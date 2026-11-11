class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(costBoth>=cost1+cost2)return (long)cost1*need1+(long)cost2*need2;
        int both=Math.min(need1,need2);
        long sum=(long)both*costBoth;
        need1-=both;
        need2-=both;
        if(need1>0)
        sum+=(long)need1*Math.min(costBoth,cost1);
        if(need2>0)
        sum+=(long)need2*Math.min(costBoth,cost2);
        return sum;
    }
}