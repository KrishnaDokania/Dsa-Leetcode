class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        sub(nums,0,list);
        return list;
    }
    void sub(int nums[],int index, List<List<Integer>>list){
        if(index==nums.length){
            List<Integer>inner=new ArrayList<>();
            for(int num:nums){
            inner.add(num);
        }
            list.add(inner);
            return;
        }
        for(int i=index;i<nums.length;i++){
            int tmp=nums[i];
            nums[i]=nums[index];
            nums[index]=tmp;
            sub(nums,index+1,list);
            nums[index]=nums[i];
             nums[i]=tmp;
           
        }
    }
}