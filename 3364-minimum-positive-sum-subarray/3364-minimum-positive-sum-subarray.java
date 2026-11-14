class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int result=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            int j=0;
            int k=i;
            while(k<n && j<r){
               sum+=nums.get(k);
               j++;
               if(j>=l && sum>0){
                result=Math.min(result,sum);
                }
               k++;
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}