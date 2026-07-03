class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int i=0;
        int j=0;
        int count=0;
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                count+=n-j;
                char ch1=s.charAt(i);
                if(map.get(ch1)==1)map.remove(ch1);
                else map.put(ch1,map.getOrDefault(ch1,0)-1);
                i++;
            }
            j++;
        }
        return count;
    }
}