class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i=0;
        int j=0;
        int n=arr.length;
        int currentsum=0;
        int maxlenInd[]=new int[n];
        int result=Integer.MAX_VALUE;
        int maxlen=Integer.MAX_VALUE;
        Arrays.fill(maxlenInd,Integer.MAX_VALUE);
        while(j<n){
            currentsum+=arr[j];
            while(i<j&&currentsum>target){
                currentsum-=arr[i];
                i++;
            }
            if(currentsum==target){
                int len=j-i+1;
                if(i>0&&maxlenInd[i-1]!=Integer.MAX_VALUE){
                    result=Math.min(result,len+maxlenInd[i-1]);
                }
                 maxlen=Math.min(maxlen,len);
            }
                 maxlenInd[j]=maxlen;
                 j++;
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}