class Solution {
    public int maxLength(List<String> arr) {
    return solve(0,"",arr);
}
int solve(int index,String tmp,List<String> arr){
    if(index>=arr.size())return tmp.length();
    int include=0;
    int exclude=0;
   exclude=solve(index+1,tmp,arr);
    if(!duplicate(tmp,arr.get(index)))
    include=solve(index+1,tmp+arr.get(index),arr);
    return Math.max(include,exclude);
}
 boolean duplicate(String tmp, String arr){
    int freq[]=new int[26];
    for(char ch:tmp.toCharArray()){
        if(freq[ch-'a']>0)return true;
        freq[ch-'a']++;
    }
    for(char ch:arr.toCharArray()){
        if(freq[ch-'a']>0)return true;
        freq[ch-'a']++;
    }
    return false;
 }
}