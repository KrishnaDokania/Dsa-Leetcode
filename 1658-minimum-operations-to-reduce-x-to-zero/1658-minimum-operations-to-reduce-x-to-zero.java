class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum=0;
        int n=nums.length;
        for(int i:nums){
            totalsum+=i;
        }
        int target=totalsum-x;
        int sum=0;
        int j=0;
        int max=-1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(j<n&&sum>target){
                sum-=nums[j];
                j++;
        }
          if(sum==target){
               max= Math.max(max,i-j+1);
            }
        }
            return max==-1?-1:n-max;
    }
}