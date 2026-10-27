class Solution {
    public String[] createGrid(int m, int n) {
        String arr[]=new String[m];
        String tmp="";
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0||j==n-1){
                tmp+=".";
            }
            else tmp+='#';
        }
        arr[i]=tmp;
        tmp="";
      }
      return arr;
    }
}