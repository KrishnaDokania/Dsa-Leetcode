class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        int sum=0;
        for(int i=0;i<n/2;i++){
            sum+=mid-nums[i];
        }
        for(int i=n/2;i<n;i++){
            sum+=nums[i]-mid;
        }
        return sum;
    }
}