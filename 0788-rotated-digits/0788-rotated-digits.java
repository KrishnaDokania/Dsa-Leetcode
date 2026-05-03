class Solution {
    public int rotatedDigits(int n) {
        return solve(1,n);
    }
    int solve(int index,int n){
        if(index==n+1)return 0;
        if(check(index)) return 1+solve(index+1,n);
       return solve(index+1,n);
    }
    boolean check(int n){
        boolean good=false;
        while(n>0){
            int r=n%10;
            if(r==2||r==5||r==6||r==9)good=true;;
            if(r==3||r==4||r==7)return false;
            n=n/10;
        }
        return good;
    }
}