class Solution {
    int n;
    public List<String> generateParenthesis(int n) {
        this.n=n;
        List<String>result=new ArrayList<>();
        generate(0,0,result,"");
        return result;
    }
    void generate(int open,int close ,List<String>result, String tmp){
        if(open==n&&close==n){
            result.add(tmp);
            return;
        }
        if(open>n||close>n)return;
        if(open<n){
            generate(open+1,close,result, tmp+"(");
        }
        if(close<open){
            generate(open,close+1,result,tmp+")");
        }
    }
}