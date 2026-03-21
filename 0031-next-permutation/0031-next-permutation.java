class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
            index=i;
            break;
            }
             }
             if(index==-1){
                reverse(nums,index);
                return;
             }
             for(int i=n-1;i>index;i--){
                if(nums[index]<nums[i]){
                     int tmp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=tmp;
                    break;
                }
             }
             reverse(nums,index);
    }
             public void reverse(int[]nums,int index){
                int left=index+1;int right=nums.length-1;
                while(left<right){
                    int tmp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=tmp;
                    left++;
                    right--;
                }
             }
}