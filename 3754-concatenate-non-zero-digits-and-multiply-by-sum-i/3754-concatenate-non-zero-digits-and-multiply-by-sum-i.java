class Solution {
    public long sumAndMultiply(int n) {
        String tmp=Integer.toString(n);
        int x=0;int sum=0;
        for(int i=0;i<tmp.length();i++){
            char ch=tmp.charAt(i);
            if(ch=='0')continue;
            sum=sum+(ch-'0');
            x=x*10+(ch-'0');
        }
        return 1L*sum*x;
    }
}