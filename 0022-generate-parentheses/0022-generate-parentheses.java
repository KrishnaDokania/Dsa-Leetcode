class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generate(n,0,0,result,"");
        return result;   
        }
        void generate(int n,int open,int close,List<String>result,String cur){
            if(open==n && close==n){
                result.add(cur);
            return;
            }
            if(open>n||close>n)return;
            if(open<n)
                generate(n,open+1,close,result,cur+"(");
            if(close<open)
                generate(n,open,close+1,result,cur+")");
        }
}