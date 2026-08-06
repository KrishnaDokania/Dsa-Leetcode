class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+t;i++){
            int tmp=i;
            int product=1;
            while(tmp>0){
                int rem=tmp%10;
                product=product*rem;
                tmp/=10;
            }
            if(product%t==0)return i;
        }
        return n;
    }
}