class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length<2)return false;
        Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]!=i)return false;
            }
            if(nums[nums.length-1]!=nums[nums.length-2])return false;
            return true;
    }
}