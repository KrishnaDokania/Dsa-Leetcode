class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int layer=Math.min(n,m)/2;
        for(int i=0;i<layer;i++){
            int top=i;
            int left=i;
            int right=m-i-1;
            int bottom=n-i-1;
            List<Integer>list=new ArrayList<>();
            for(int l=left;l<=right;l++){
                list.add(grid[top][l]);
            }
            for(int t=top+1;t<=bottom-1;t++){
                list.add(grid[t][right]);
            }
            for(int r=right;r>=left;r--){
                list.add(grid[bottom][r]);
            }
            for(int b=bottom-1;b>=top+1;b--){
                list.add(grid[b][left]);
            }
            int size=list.size();
            int mod=k%size;
            Collections.rotate(list,-mod);
            int index=0;
            for(int l=left;l<=right;l++){
                grid[top][l]=list.get(index++);
            }
            for(int t=top+1;t<=bottom-1;t++){
                grid[t][right]=list.get(index++);
            }
            for(int r=right;r>=left;r--){
                grid[bottom][r]=list.get(index++);
            }
            for(int b=bottom-1;b>=top+1;b--){
                grid[b][left]=list.get(index++);
            }

        }
        return grid;
    }
}