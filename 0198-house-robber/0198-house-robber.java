class Solution {
    public int rob(int[] nums) {
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
        int current=Math.max(even,odd+nums[i]);
        odd=even;
        even=current;
           
        }
        return even;
    }
}