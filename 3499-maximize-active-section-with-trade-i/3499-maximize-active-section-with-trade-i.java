class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        int count=0;
        int one=0;
        List<Integer>zero= new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='0')count++;
            else if(ch!=0 && count>0){
                zero.add(count);
                count=0;

            }
            if(ch=='1')
                one++;
        }
        int max=0;
        if(count!=0)zero.add(count);
        for(int i=zero.size()-1;i>0;i--){
            max=Math.max(max,zero.get(i)+zero.get(i-1));
        }
        return max+one;
    }
}