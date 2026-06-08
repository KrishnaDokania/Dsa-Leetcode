class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =nums.length;
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<n;i++){
            rightsum=sum-leftsum-nums[i];
            arr[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return arr;
    }
}