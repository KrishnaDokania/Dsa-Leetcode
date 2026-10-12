class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod=1000000007;
        int count[]=new int[30];
        for(int i:nums)
        for(int x=0;x<30;x++)count[x]+=i>>x&1;
        long total=0;
        for(int i=0;i<k;i++){
            long row=0;
            for(int x=0;x<30;x++)
            if(count[x]>i)row|=1L<<x;
            total=(total+row*row)%mod;
        }
        return (int)total;
    }
}