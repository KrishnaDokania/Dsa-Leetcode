class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>outer=new ArrayList<>();
       List<Integer>inner=new ArrayList<>();
        generate(candidates,target,outer,inner,0);
        return outer;
    }
    void generate(int[] nums, int target, List<List<Integer>>outer,List<Integer>inner,int index){
        if(index==nums.length||target<0)return;
        if(target==0){
            outer.add(new ArrayList<>(inner));
            return;
        }
        inner.add(nums[index]);
        generate(nums,target-nums[index],outer,inner,index);
        inner.remove(inner.size()-1);
        generate(nums,target,outer,inner,index+1);

        }
}