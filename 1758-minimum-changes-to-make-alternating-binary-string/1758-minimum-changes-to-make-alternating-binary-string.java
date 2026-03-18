class Solution {
    public int minOperations(String s) {
     int count0=0;
     int count1=0;
     for(int i=0;i<s.length();i++){
       if(((i%2==0)?'1':'0') != s.charAt(i))count1++;
       if(((i%2==0)?'0':'1') != s.charAt(i))count0++;
     }
     return Math.min(count1,count0);
    }
}