class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean iszero=false;
        for(int num:nums){
            xor^=num;
            if(num!=0){
                iszero=true;
            }
        }
            if(xor!=0)return nums.length;
            if(!iszero)return 0;
            return nums.length-1;
               }

}