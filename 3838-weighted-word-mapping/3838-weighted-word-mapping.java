class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String tmp="";
        for(int i=0;i<words.length;i++)
            {
                int sum=0;
                for(int j=0;j<words[i].length();j++){
                    sum+=weights[words[i].charAt(j)-'a'];
                }
                sum=(25-(sum%26))+97;
                tmp=tmp+(char)sum;
            }
            return tmp;
    }
}