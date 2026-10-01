class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
    Stack<Character> st=new Stack<>();
       for(char ch: s.toCharArray()){
       if(ch=='(' || ch=='[' || ch=='{') 
       st.push(ch);
       else{
        if(st.isEmpty())
        return false;
        char tmp=st.pop();
        if((tmp!='(' && ch==')')||(tmp!='{' && ch=='}')||(tmp!='[' && ch==']'))
        return false;
        }
       }
        return st.isEmpty();
    }
}