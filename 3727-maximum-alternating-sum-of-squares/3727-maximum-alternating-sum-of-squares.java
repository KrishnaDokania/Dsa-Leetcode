class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i]*nums[i];
        }
        long score=0;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            score+=arr[right]-arr[left];
            right--;
            left++;
        }
       if(n%2!=0)score+=arr[left];
       return score;
    }
}