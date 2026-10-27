class Solution {
    public String[] createGrid(int m, int n) {
        String arr[]=new String[m];
      for(int i=0;i<m;i++){
        StringBuilder tmp=new StringBuilder();
        for(int j=0;j<n;j++){
            if(i==0||j==n-1){
                tmp.append('.');
            }
            else 
                tmp.append('#');
        }
        arr[i]=tmp.toString();
      }
      return arr;
    }
}