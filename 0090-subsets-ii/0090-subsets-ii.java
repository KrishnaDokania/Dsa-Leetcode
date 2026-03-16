class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>outer=new ArrayList<>();
        List<Integer>inner=new ArrayList<>();
        sub(nums,0,inner,outer);
        return outer;
    }
    void sub(int nums[] ,int index,List<Integer>inner, List<List<Integer>>outer){
        if(index==nums.length){
            outer.add(new ArrayList<>(inner));
            return;
        }
        inner.add(nums[index]);
        sub(nums,index+1,inner,outer);
        inner.remove(inner.size()-1);
        index+=1;
        while(index<nums.length&&nums[index]==nums[index-1]){
            index++;
        }
            sub(nums,index,inner,outer);
            }
}