class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(sr,sc,image,image[sr][sc],color);
        return image;
    }
    void dfs(int i, int j,int[][]image,int orgcol,int newcol){
        if(i<0||i>=image.length||j<0||j>=image[0].length||image[i][j]==newcol||image[i][j]!=orgcol)return;
        image[i][j]=newcol;
        dfs(i-1,j,image,orgcol,newcol);
        dfs(i,j+1,image,orgcol,newcol);
        dfs(i+1,j,image,orgcol,newcol);
        dfs(i,j-1,image,orgcol,newcol);
    }
}