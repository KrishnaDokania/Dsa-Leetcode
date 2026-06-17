class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>>result=new ArrayList<>();
         generate(0,nums,new ArrayList<>(),result);
         return result;
    }
    void generate(int index,int[]num,List<Integer>inner,List<List<Integer>>result){
        if(index==num.length){
            result.add(new ArrayList<>(inner));
            return;
        }
        inner.add(num[index]);
        generate(index+1,num,inner,result);
        inner.remove(inner.size()-1);
        generate(index+1,num,inner,result);

    }
}