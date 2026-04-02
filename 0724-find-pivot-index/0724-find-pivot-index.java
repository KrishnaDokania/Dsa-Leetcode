class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int total=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightsum=total-leftsum-nums[i];
            if(leftsum==rightsum)return i;
            if((i==0&&rightsum==0)||(i==nums.length-1&&leftsum==0))return 0;
            leftsum+=nums[i];
        }
        return -1;
    }
}