class Solution {
    public int maxProduct(int[] num){
        int l=num.length;
        int total=0;
        int max1=-1;
        int max2=-1;
        for(int i=0;i<l;i++){
            if (max1<num[i]){
                max2=max1;
                max1=num[i];
            }
            else if(max2<num[i])
            max2=num[i];
        }
            total=(max1-1)*(max2-1);
        
        return total;
    }
}