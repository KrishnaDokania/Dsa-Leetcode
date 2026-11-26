class Solution {
    public boolean canAliceWin(int n) {
        int alice=10;
        Boolean aturn=true;
        Boolean bturn=false;
        int bob=9;
        while(n>0){
            if(aturn){
                n=n-alice;
                alice-=2;
                aturn=false;
                bturn=true;
                if(n<0)
                return false;
                if(n==0)return true;
            }
            else{
                n=n-bob;
                bob-=2;
                bturn=false;
                aturn=true;
                if(n<0)return true;
                if(n==0)return false;
            }
        }
        return false;
    }
}