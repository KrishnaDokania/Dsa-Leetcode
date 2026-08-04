class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        int i=0;
        while(min<max){
            if(nums[i]!=min){
                list.add(min);
            }
            else
            i++;
            min++;
        }
        return list;
    }
}