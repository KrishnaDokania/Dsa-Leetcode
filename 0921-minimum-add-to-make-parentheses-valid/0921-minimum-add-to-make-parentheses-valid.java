class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int n=s.length();
        int i=0;
        Stack<Character>st=new Stack<>();
        while(i<n){
            if(s.charAt(i)=='(')
            st.push('(');
            else{
                int j=i;
            while(j<n&&!st.isEmpty()&&s.charAt(j)==')'){
                      st.pop();
                      j++;
            }
            while(j<n&&s.charAt(j)==')'){
            count++;
            j++;
            }
            i=j-1;
            }
            i++;
        }
        count+=st.size();
        return count;
    }
}