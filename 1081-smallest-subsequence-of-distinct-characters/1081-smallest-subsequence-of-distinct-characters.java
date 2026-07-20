class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character>st=new Stack<>();
        boolean check[]=new boolean[26];
        int ind[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            ind[s.charAt(i) -'a']=i;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
             if(check[ch-'a'])continue;
            while(!st.isEmpty()&&st.peek()>ch && ind[st.peek()-'a']>i){
                check[st.pop()-'a']=false;
            }
            check[ch-'a']=true;
            st.push(ch);
        } 
        String tmp="";
        while(!st.isEmpty()){
            tmp=st.pop()+tmp;
        }
        return tmp;
    }
}