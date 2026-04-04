class Solution {
    public boolean isPowerOfThree(int n) {
        int left=0;
        int right=30;
        while(left<right){
            int mid=left+(right-left)/2;
            double pow= Math.pow(3,mid);
            if(pow==(double)n)
            return true;
            else if(pow<(double)n)
            left=mid+1;
            else
            right=mid;
        }
        return false;
    }
}