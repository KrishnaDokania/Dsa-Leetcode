class Solution {
    public int numberOfSpecialChars(String word) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)&&freq1[ch-'A']==0)
            freq1[ch-'A']++;
            else if(Character.isLowerCase(ch)&&freq2[ch-'a']==0)
            freq2[ch-'a']++;
        }

        int sum=0;
        for(int i=0;i<26;i++){
            if(freq1[i]>0 && freq2[i]>0)sum++;
        }
        return sum;
    }
}