class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>outer=new ArrayList<>();
        sub(nums,0,outer);
        return outer;
    }
   void sub(int nums[],int index,List<List<Integer>>outer){
    if(index==nums.length){
        List<Integer>inner=new ArrayList<>();
        for(int i: nums){
            inner.add(i);
        }
        outer.add(inner);
        return;
        }
         HashSet<Integer> set = new HashSet<>();
    for(int i=index;i<nums.length;i++){
        if(set.contains(nums[i]))continue;
        set.add(nums[i]);
        int tmp=nums[i];
        nums[i]=nums[index];
        nums[index]=tmp;
        sub(nums,index+1,outer);
        nums[index]=nums[i];
        nums[i]=tmp;
    }
}
}