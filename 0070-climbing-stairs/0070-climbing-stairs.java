class Solution {
    public int climbStairs(int n) {
        if(n<=3)return n;
        int a=2;
        int b=3;
        int next=0;
        for(int i=4;i<=n;i++){
            next=a+b;
            a=b;b=next;
        }
        return next;
    }
}