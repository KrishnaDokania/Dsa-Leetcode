class Solution {
    public long countOfSubstrings(String s, int k) {
        Map<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int arr[]=new int[n];
        int last=n;
        for(int i=n-1;i>=0;i--){ 
        arr[i]=last;
        if(!check(s.charAt(i)))
        last=i;
        }
        int i=0;
        int j=0;
        int consot=0;
        long count=0;
        while(j<n){
            char ch=s.charAt(j);
            if(check(ch))
            map.put(ch,map.getOrDefault(ch,0)+1);
            else
            consot++;
            while(consot>k){
                char ch2=s.charAt(i);
                if(check(ch2)){
                    if(map.get(ch2)==1)
                    map.remove(ch2);
                    else
                    map.put(ch2,map.get(ch2)-1);
                }
                else
                consot--;
                i++;
            }
            while(map.size()==5 && consot==k){
                char ch2=s.charAt(i);
                int ind=arr[j];
                count+=ind-j;
                if(check(ch2)){
                    if(map.get(ch2)==1)
                    map.remove(ch2);
                    else
                    map.put(ch2,map.get(ch2)-1);
                }
                 else
                consot--;
                i++;
            }
            j++;
        }
        return count;
    }

    boolean check(char ch){
        if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
        return false;
    }
}