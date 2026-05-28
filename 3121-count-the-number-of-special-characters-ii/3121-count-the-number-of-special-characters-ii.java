class Solution {
    public int numberOfSpecialChars(String word) {
      
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(int i=0;i<26;i++){
            freq1[i]=-1;
            freq2[i]=-1;
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                freq1[ch-'a']=i;
            }
             else if(freq2[ch-'A']==-1){
                freq2[ch-'A']=i;            
                }
        }
        int sum=0;
        for(int i=0;i<26;i++){
         if(freq1[i]!=-1&&freq2[i]!=-1&&freq1[i]<freq2[i])
         sum++;
        }
        return sum;
    }
}