class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        int tmp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
            else {
                if(count!=0)
                tmp++;
                count=0;
                }
        }
        if(count!=0)tmp++;
        if(tmp<=1)return true;
        return false;
    }
}