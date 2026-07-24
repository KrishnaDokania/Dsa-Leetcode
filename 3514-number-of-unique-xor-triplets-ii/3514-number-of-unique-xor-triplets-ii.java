class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
            boolean set[]=new boolean[2048];
       boolean result[]=new boolean[2048];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                set[nums[i]^nums[j]]=true;
            }
        }
        for(int x=0;x<2048;x++){ 
            if(!set[x])continue;
            for(int k:nums){
                result[x^k]=true;
        }
        }
        int count=0;
        for(int i=0;i<2048;i++)
        if(result[i])count++;
        return count;
    }
}