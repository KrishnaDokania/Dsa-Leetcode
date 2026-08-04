class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        List<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            if(max<num)
            max=num;
            if(min>num)
            min=num;
            set.add(num);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i))
            list.add(i);
        }
        return list;
    }
}