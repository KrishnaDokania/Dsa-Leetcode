class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int countspace=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='_')countspace++;
            else if(ch=='L')count++;
            else count--;
        }
        if(count<0)count=count*-1+countspace;
        else count+=countspace;
        return count;
    }
}