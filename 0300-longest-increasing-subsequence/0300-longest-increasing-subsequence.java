class Solution {
    public int lengthOfLIS(int[] nums) {
        int arr[]=new int[nums.length];
        int len=1;
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>arr[len-1]){
                arr[len]=nums[i];
                len++;
            }
            else{
                int index=lowerBound(arr,len,nums[i]);
                arr[index]=nums[i];
            }
        }
        return len;
    }
    static int lowerBound(int[] arr, int len,int target) {
    int low = 0, high = len-1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] < target)
            low = mid + 1;
        else
            high = mid;
    }

    return low;
}
}