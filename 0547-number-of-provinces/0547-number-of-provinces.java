class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1&& i!=j){
                adj.get(i).add(j);
                }         
            }
        }
        int count=0;
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
    void dfs(int i,List<List<Integer>>adj,int vis[]){
        vis[i]=1;
        for(int it:adj.get(i)){
            if(vis[it]==0){
                dfs(it,adj,vis);
            }
        }
    }
}