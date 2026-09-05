class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int prefixmax[]=new int[n];
        int prefixmin[]=new int[n];
        prefixmax[0]=nums[0];
        prefixmin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],nums[i]);
        }
        for(int j=n-2;j>=0;j--){
            prefixmin[j]=Math.min(prefixmin[j+1],nums[j]);
        }
        for(int i=0;i<n;i++){
            if(prefixmax[i]-prefixmin[i]<=k)return i;
        }
        return -1;
    }
}