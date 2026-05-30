class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i];
            int sum=0;
            while(val>0){
                int rem=val%10;
                sum+=rem;
                val/=10;
            }
            nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}