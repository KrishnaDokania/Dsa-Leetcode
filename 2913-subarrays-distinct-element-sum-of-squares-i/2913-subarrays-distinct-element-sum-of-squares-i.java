class Solution {
    int n;
    int count=0;
    public int sumCounts(List<Integer> nums) {
        n=nums.size();
        for(int i=0;i<n;i++){   
        solve(nums,new HashSet<>(),i);
        }
        return count;
    }
    void solve(List<Integer>nums,Set<Integer>set,int ind){
        if(ind==n){
            return;
        }
        set.add(nums.get(ind));
        count+=set.size()*set.size();
      
        solve(nums,set,ind+1);
    }
     
}