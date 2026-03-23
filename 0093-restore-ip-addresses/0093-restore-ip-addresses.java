class Solution {
    int n;
    public List<String> restoreIpAddresses(String s) {
        n=s.length();
     List<String>result=new ArrayList<>();
     generate(s,0,0,"",result);
     return result;  
    }
    void generate(String s, int index,int part,String str, List<String>result){
        if(index==n&&part==4){
           result.add(str.substring(0,str.length()-1));
            return;
        }
        if(n>12)return;
        
       for (int len = 1; len <= 3; len++) {
            if (index + len > n) break;

            String tmp = s.substring(index, index + len);

            if (!valid(tmp)) continue;

            generate(s, index + len, part + 1, str + tmp + ".", result);
        }
    }
    boolean valid(String tmp){
        if(tmp.length()>1&&tmp.charAt(0)=='0')return false;
        return Integer.parseInt(tmp)<=255;
    }
}