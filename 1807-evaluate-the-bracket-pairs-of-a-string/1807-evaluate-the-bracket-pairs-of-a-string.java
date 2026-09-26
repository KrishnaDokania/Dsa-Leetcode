class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n=s.length();
        int i=0;
        int j=0;
        Map<String,String>map=new HashMap<>();
        for(List<String>list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder sb=new StringBuilder();
        while(i<n){
            j=i;
            char ch=s.charAt(i);
            if(ch=='('){
                while(j<n&&s.charAt(j)!=')'){
                    j++;
                }
                sb.append(map.getOrDefault(s.substring(i+1,j),"?"));
                i=j+1;
            }
            else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}