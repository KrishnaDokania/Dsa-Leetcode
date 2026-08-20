class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int right=n-1;
        int left=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
            for(int i=left;i<n;i++){
                if(nums[i]!=target)break;
                list.add(i);
            }
            return list;
    }
}