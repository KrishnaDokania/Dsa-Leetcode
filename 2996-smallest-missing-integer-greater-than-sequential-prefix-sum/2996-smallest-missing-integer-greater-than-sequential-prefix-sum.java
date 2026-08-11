class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        int n=nums.length;
        int check=1;
        int index=0;
        Set<Integer>set=new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i-1]+1==nums[i]&&check==1){
            sum+=nums[i];
            }
            else {
                if(check==1){
                    check=0;
                }
            }
                set.add(nums[i]);
        }
        for(int i=0;i<n;i++){   
        if(set.contains(sum))
        sum+=1;
        }
        return sum;
    }
}