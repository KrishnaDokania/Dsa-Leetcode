class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>outer=new ArrayList<>();
        List<Integer>inner=new ArrayList<>();
        generate(candidates,target,0,outer,inner);
        return outer;
    }
    void generate(int[] nums, int target,int index,List<List<Integer>>outer, List<Integer>inner){
        if(target==0){
            outer.add(new ArrayList<>(inner));
            return;
        }
        if(target<0||index==nums.length)return;
        inner.add(nums[index]);
        generate(nums,target-nums[index],index+1,outer,inner);
        inner.remove(inner.size()-1);
       int newindex= index+1;
        while(newindex<nums.length && nums[newindex]==nums[index]){newindex++;}
        generate(nums,target,newindex,outer,inner);
    }
}