class Solution {
    int n,m;
    public int orangesRotting(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int count=0;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                q.offer(new int[]{i,j});
                 else if(grid[i][j]==1)
                 count++;
            }
        }
        int time=0;
        while(!q.isEmpty()&&count>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int arr[]=q.poll();
                int r=arr[0];
                int c=arr[1];
                int next[][]={{r-1,c},{r,c+1},{r+1,c},{r,c-1}};
                for(int neigh[]:next){
                    int nr=neigh[0];
                    int nc=neigh[1];
                   if(nr>=0 && nr<m &&nc>=0 && nc<n &&grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    count--;
                    q.offer(new int[]{nr,nc});
                    }
                }
                }
                time++;
                if(count==0)break; 
            }
        return count==0?time:-1;
    }
}