class Solution {
    public long countCommas(long n) {
        long count=0;
        long i=1000;
        while(n>=i){
            count+=n-i+1;
            i=i*1000;
        }
        return count;
    }
}