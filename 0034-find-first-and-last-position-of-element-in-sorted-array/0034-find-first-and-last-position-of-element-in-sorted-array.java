class Solution {
    public int[] searchRange(int[] nums, int target) {
          int left=0;
        int right=nums.length-1;
        int arr[]={-1,-1};
        if(nums.length==0)
        return arr;
        while(left<right){
            int mid=left+(right-left)/2;
             if(nums[mid]>=target)
            right=mid;
            else
            left=mid+1;
        }
        if(nums[left]==target)
        arr[0]=left;
        else 
        return arr;
        left=0;
        right=nums.length-1;
         while(left<right){
               int mid=left+(right-left)/2;
             if(nums[mid]<=target)
            left=mid+1;
            else
            right=mid;
        }
        if(nums[left]==target) 
        arr[1]=left;
        else
        arr[1]=left-1;
        return arr;
    }

    
}