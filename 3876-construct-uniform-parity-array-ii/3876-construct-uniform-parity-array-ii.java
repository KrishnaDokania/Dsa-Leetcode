class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int minodd=Integer.MAX_VALUE;
        boolean isodd=false;
        boolean iseven=false;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                if(minodd>nums1[i]){
                    minodd=nums1[i];
                }
                isodd=true;
            }
            else iseven=true;
        }
        if((iseven && !isodd)||(!iseven && isodd))return true;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0 && nums1[i]<minodd){
                return false;
        }
        }
        return true;
    }
}