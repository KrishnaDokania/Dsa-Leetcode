class Solution {
    public int[] validSequence(String word1, String word2) { 
        int n=word1.length();
        int m=word2.length();
        int i=n-1;
        int j=m-1;
        int wordlenarr[]=new int[n];
        int wordlen=0;
        while(i>=0){
            if(j>=0 && word1.charAt(i)==word2.charAt(j)){
            wordlen++;
            j--;
            }
            wordlenarr[i]=wordlen;
            i--;
        }
        int result[]=new int[m];
        boolean power=true;
        i=0;
        j=0;
        while(i<n&&j<m){
            if(word1.charAt(i)==word2.charAt(j)){
                result[j]=i;
                j++;
            }
            else if(power==true && i+1<n && wordlenarr[i+1]>=m-j-1){
                result[j]=i;
                j++;
                power=false;
            }
            i++;
        }
        if(j==m)return result;
        return new int[0];
    }
}