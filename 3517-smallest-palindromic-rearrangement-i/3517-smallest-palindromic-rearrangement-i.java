class Solution {
    public String smallestPalindrome(String s) {
        int ch[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            ch[s.charAt(i)-'a']++;
        }
       StringBuilder left = new StringBuilder();
       StringBuilder mid=new StringBuilder();
        for(int i=0;i<26;i++){
            for (int j = 0; j < ch[i] / 2; j++) {
                left.append((char) ('a' + i));
        }
        if(ch[i]%2==1 && mid.length()==0){
            mid.append((char) ('a' + i));
        }
        }
        return left.toString()+mid+new StringBuilder(left).reverse().toString();

    }
}