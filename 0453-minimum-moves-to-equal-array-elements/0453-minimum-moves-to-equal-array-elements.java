class Solution {
    public int minMoves(int[] nums) {
    long sum=0;
     int max=Integer.MAX_VALUE;
     for(int num:nums)
     if(num<max)max=num;
     for(int num:nums)sum+=num-max;
     return (int)sum;
    }
}