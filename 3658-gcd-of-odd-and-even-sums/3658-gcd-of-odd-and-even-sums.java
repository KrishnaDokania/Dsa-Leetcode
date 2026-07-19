class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;int even=0;
            for(int i=1;i<=n*2;i++){
            if(i%2!=0)
            odd+=i;
            else
            even+=i;
        }
        int gcd=1;
        for(int i=1;i<=odd;i++){
            if(odd%i==0&&even%i==0)gcd=i;
        }
        return gcd;
    }
}