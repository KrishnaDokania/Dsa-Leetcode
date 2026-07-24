class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
      int n=nums.length;
      int max=nums[0];
      for(int i =1;i<n;i++){
        if(nums[i]>max)
        max=nums[i];
      }
      int freq[]=new int[max+1];
      for(int num:nums){
        for(int j=1;j*j<=num;j++){
            if(num%j==0){
            freq[j]++;
            if(num/j!=j)
            freq[num/j]++;
        }
        }
      }
      long paircount[]=new long[max+1];
      for(int g=max;g>=1;g--){
        long count=freq[g];
        paircount[g]=count*(count-1L)/2;
        for(int c=2*g;c<=max;c+=g){
            paircount[g]-=paircount[c];
        }
      }
      
      for(int i=1;i<=max;i++){
        paircount[i]+=paircount[i-1];
      }
      int result[]=new int[queries.length];
      for(int i=0;i<queries.length;i++){
        long query=queries[i];
        int l=1;
        int r=max;
        int tmp=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(paircount[mid]>query){
                tmp=mid;
                r=mid-1;
            }
            else
            l=mid+1;
        } 
        result[i]=tmp;
      }
      return result;
    }
}