class Solution {
    public int minInsertions(String s) {
        int i=0;
        int count=0;
        int open=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)=='('){open+=2;
            if(open%2==1){
                open--;
                count++;
            }
            }
            else{
                open--;
            
                if(open<0){
                    count++;
                    open=1;
            }
            }
            i++;
        }
        return count+open;
    }
}