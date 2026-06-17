class Solution {
    public String longestCommonPrefix(String[] strs) {
        String tmp=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(tmp)!=0){
                tmp=tmp.substring(0,tmp.length()-1);
                if(tmp.length()==0)return"";
            }
        }
        return tmp;
    }
}