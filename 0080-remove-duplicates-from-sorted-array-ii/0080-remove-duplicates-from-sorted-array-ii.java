class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        int j=0;
        while(j!=n){
        int count=1;
            while(j+1<n && nums[j]==nums[j+1]){
                count++;
                j++;
            }
            for(int i=0;i<Math.min(count,2);i++){
                nums[k]=nums[j];
                k++;
            }
            j++;
        }
        return k;    
        }
}