class Solution { 
    String result;
    public String lexGreaterPermutation(String s, String target) {
        result="";
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        solve(0,false,target,count,new StringBuilder());
        return result;
    }
   boolean solve(int i,boolean check,String target,int[]count,StringBuilder current){
        if(i==target.length()){
            if(check){
            result=current.toString();
            return true;
        }
        return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(count[ch-'a']==0)continue;
            if(check==false && ch< target.charAt(i))continue;
            count[ch-'a']--;
            current.append(ch);
            boolean greater=check||ch>target.charAt(i);
            if(solve(i+1,greater,target,count,current))
            return true;
            count[ch-'a']++;
            current.deleteCharAt(current.length()-1);
        }
        return false;
    }
}