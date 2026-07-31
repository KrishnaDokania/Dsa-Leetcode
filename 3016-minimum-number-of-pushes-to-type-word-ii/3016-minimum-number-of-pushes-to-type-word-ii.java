class Solution {
    public int minimumPushes(String s) {
        int freq[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        Integer ind[]=new Integer[26];
        for(int i=0;i<26;i++){
            ind[i]=i;
        }
        Arrays.sort(ind,(a,b)->Integer.compare(freq[b],freq[a]));
        int result=0;
        int j=0;
        int count=1;
        for(int i=0;i<26;i++){
            if(freq[ind[i]]>0){
                result=result+freq[ind[i]]*count;
                j++;
                if(j>=8){
                count++;
                j=0;
                }
                
            }

        }
        return result;
    }
}