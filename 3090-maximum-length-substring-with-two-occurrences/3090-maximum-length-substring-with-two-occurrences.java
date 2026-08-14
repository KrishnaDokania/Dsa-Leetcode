class Solution {
    public int maximumLengthSubstring(String s) {
         int n=s.length();
        int max=0;
        int freq[]=new int[26];
        int j=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
            sb.deleteCharAt(0);
            freq[s.charAt(j)-'a']--;
            j++;
            }
            sb.append(s.charAt(i));
           max= Math.max(max,sb.length());
        }
        return max;
    }
}