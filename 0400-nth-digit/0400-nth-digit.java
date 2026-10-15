class Solution {
    public int findNthDigit(int n) {
    int left=1;
    long digit=9;
    int len=1;
    while(n>digit*len){
        n-=digit*len;
        len++;
        left*=10;
        digit*=10;
    }
    left+=(n-1)/len;
    String str=Integer.toString(left);
    return str.charAt((n-1)%len)-'0';
    }
}