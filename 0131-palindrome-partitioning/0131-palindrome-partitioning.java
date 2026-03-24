class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>result=new ArrayList<>();
        List<String>inner=new ArrayList<>();
        generate(s,0,inner,result);
        return result;
    }
    void generate(String s,int index,List<String>inner,List<List<String>>result){
        if(index==s.length()){
            result.add(new ArrayList<>(inner));
            return;
        }
        for(int i=index;i<s.length();i++){
        String tmp=s.substring(index,i+1);
        if(palindrome(tmp)){
            inner.add(tmp);
            generate(s,i+1,inner,result);
            inner.remove(inner.size()-1);
        }
        }
    }
    boolean palindrome(String tmp){
        int first=0;
        int last=tmp.length()-1;
        while(first<last){
            if(tmp.charAt(first)!=tmp.charAt(last))return false;
            first++;
            last--;
        }
        return true;
    }
}