class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int component[]=new int[n];
        int value=0;
        int q=queries.length;
        component[0]=value;
        boolean result[]=new boolean[q];
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                value++;
            }
                component[i]=value;

        }
        for(int i=0;i<q;i++){
            if(component[queries[i][0]]==component[queries[i][1]])
            result[i]=true;
        }
        return result;
    }
} 