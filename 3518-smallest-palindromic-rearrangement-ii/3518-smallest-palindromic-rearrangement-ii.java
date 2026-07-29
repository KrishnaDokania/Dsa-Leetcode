class Solution {
    public String smallestPalindrome(String s, int k) {
        int n=s.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder left=new StringBuilder();
        String mid="";
        for(int i=0;i<26;i++){
              if(freq[i]%2==1){
              mid = String.valueOf((char) ('a' + i));
              break;
              }

        }
        for(int j=0;j<n/2;j++){
            for(int i=0;i<26;i++){
                if(freq[i]>=2){
                    freq[i]-=2;
                    long ways=1;
                    int letter=n/2-j-1;
                    for(int c=0;c<26;c++){
                        if(freq[c]>0){
                    ways=ways*ncr(letter,freq[c]/2,k);
                    letter=letter-freq[c]/2;
                        }
                    if(k<=ways){
                        ways=k;
                        break;
                    }
                }
                if(k<=ways){
                    left.append((char)('a'+i));
                    break;
                }
                k=k-(int)ways;
                freq[i]+=2;
            }
        }
    }
    String right=new StringBuilder(left).reverse().toString();
    String result=left.toString()+mid+right;
    return result.length()==n?result:"";
    }
    public long ncr(int n ,int r,int k){
        if(r>n)return 0;
          r = Math.min(r, n - r);
        long result=1;
        for(int i=1;i<=r;i++){
            result=result*(n-r+i)/i;
            if(result>=k)return k;
        }
        return result;
    }
}