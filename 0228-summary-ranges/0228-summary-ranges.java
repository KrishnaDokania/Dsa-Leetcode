class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>list=new ArrayList<>();
        int n=nums.length;
        int i=0;
       while(i<n){
        StringBuilder sb=new StringBuilder();
        long tmp=nums[i];
        sb.append(tmp);
        long j=tmp;
        while( i<n && nums[i]==j){
            i++;
            j++;
        }
            if(j>tmp+1)
                sb.append("->").append(j-1);
                list.add(sb.toString());
                }
        return list;
    }
}