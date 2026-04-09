class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        return "";
        String tmp=strs[0];
        for(int i=1;i<strs.length;i++){
            String common="";
            for(int j=0;j<tmp.length() && j<strs[i].length() ;j++){
                if(tmp.substring(0,j+1).equals(strs[i].substring(0,j+1)))
                common=tmp.substring(0,j+1);
                else
                break;
            }
             tmp=common;
            if(tmp.equals(""))
            return tmp;

        }
        return tmp;
    }
}