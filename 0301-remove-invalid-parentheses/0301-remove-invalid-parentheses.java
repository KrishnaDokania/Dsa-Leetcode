class Solution {
    int maxlen=0;
        Set<String>set;
    public List<String> removeInvalidParentheses(String s) {
        set=new HashSet<>();
        solve(0,s,new StringBuilder(),0);
        return new ArrayList<>(set);
    }
    void solve(int i,String s,StringBuilder tmp,int count){
        if(i==s.length()){
            if(count==0){
                if(tmp.length()>maxlen){
                    maxlen=tmp.length();
                    set.clear();

                }
                if(tmp.length()==maxlen)
                set.add(tmp.toString());
            }
            return;
        }
        if(s.charAt(i)!='('&&s.charAt(i)!=')'){
        tmp.append(s.charAt(i));
        solve(i+1,s,tmp,count);
        tmp.deleteCharAt(tmp.length()-1);
        return;
        }
        if(count<0)return;   
        solve(i+1,s,tmp.append(s.charAt(i)),count+(s.charAt(i)=='(' ?1:-1));
        tmp.deleteCharAt(tmp.length()-1);
        solve(i+1,s,tmp,count);
    }
}