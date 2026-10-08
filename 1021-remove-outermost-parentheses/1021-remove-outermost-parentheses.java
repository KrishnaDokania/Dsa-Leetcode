class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder tmp=new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')open++;
            else open--;
            if((open==1&&ch=='(')||open==0&&ch==')'){
            continue;
            }
            else
            tmp=tmp.append(ch);
        }
        return tmp.toString();
    }
}