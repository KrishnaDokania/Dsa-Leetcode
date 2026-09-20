class Solution {
    public int reverseDegree(String s) {
        int freq[]=new int[26];
        int value=26;
        for(char ch='a';ch<='z';ch++){
            freq[ch-'a']=value;
            value--;
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int product=freq[ch-'a']*(i+1);
            sum+=product;
        }
        return sum;
    }
}