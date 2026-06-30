class Solution {
    public int maxNumberOfBalloons(String text) {
         int count=Integer.MAX_VALUE;;
         Map<Character,Integer>map=new HashMap<>();
         for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         String word="balloon";
         for(int i=0;i<7;i++){
            char ch=word.charAt(i);
            int tmp=0;
            if(map.containsKey(ch))
            tmp=map.get(ch);
            if(tmp!=0&& ch!='l'&&ch!='o'){
                count=Math.min(tmp,count);
            }
            else if(tmp!=0){
                count=Math.min(tmp/2,count);
            }
            else return 0;
         }
         return count;
         }
    }
