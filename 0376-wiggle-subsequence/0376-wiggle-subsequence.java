class Solution {
    public int wiggleMaxLength(int[] nums) {
        int left=1;
        int right=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1])left=right+1;
            else if(nums[i]<nums[i-1])right=left+1;
            else continue;
        }
        return Math.max(left,right);
    }
}