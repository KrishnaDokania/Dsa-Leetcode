class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int last=arr[n-1];
        int i=1;
        int j=0;
        int ans=0;
        while(i<=last){
        if(k==0)return ans;
            if(arr[j]!=i){
                k--;
                ans=i;
            }
            else{
            j++;
            }
            i++;
        }
        if(k!=0){
            ans=last+k;
        }
        return ans;
    }
}