class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int tmp=nums[i];
            int sum=0;
            while(tmp>0){
                int r=tmp%10;
                sum+=r;
                tmp/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}