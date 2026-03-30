class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>inner=new ArrayList<>();
        generate(nums,0,inner,result);
        return result;
    }
    void generate(int nums[],int index, List<Integer>inner,List<List<Integer>>result){
        if(inner.size()>=2){
            result.add(new ArrayList<>(inner));
        }
        Set<Integer>set=new HashSet<>();
        for(int i=index;i<nums.length;i++){
            if(set.contains(nums[i]))continue;
            if(inner.size()>0 && nums[i]<inner.get(inner.size()-1))continue;
                inner.add(nums[i]);
                set.add(nums[i]);
                generate(nums,i+1,inner,result);
                inner.remove(inner.size()-1);
        }
    }
}