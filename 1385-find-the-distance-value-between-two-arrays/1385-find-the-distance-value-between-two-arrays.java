class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m=arr2.length;
        int result=0;
        for(int i=0;i<arr1.length;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d)break;
                else count++;
            }
            if(count==m)result++;
        }
        return result;
    }
}