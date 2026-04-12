class Solution {
    public int nthUglyNumber(int n) {
        int arr[]=new int[n];
        arr[0]=1;
        int i2,i3,i5;
        i2=i3=i5=0;
        for(int i=1;i<n;i++){
            int solve2=arr[i2]*2;
            int solve3=arr[i3]*3;
            int solve5=arr[i5]*5;
            int min=Math.min(solve2,Math.min(solve3,solve5));
            arr[i]=min;
            if(min==solve2)i2++;
            if(min==solve3)i3++;
            if(min==solve5)i5++;
        }
        return arr[n-1];
    }
}