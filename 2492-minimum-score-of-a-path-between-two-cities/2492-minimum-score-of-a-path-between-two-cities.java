class Solution {
        int result=Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        boolean vis[]=new boolean[n+1];
    Map<Integer,List<int[]>>map=new HashMap<>();
    for(int i=1;i<=n;i++){
        map.put(i,new ArrayList<>());
    }
    for(int road[]:roads){
        int u=road[0];
        int v=road[1];
        int w=road[2];
        map.get(u).add(new int[]{v,w});
        map.get(v).add(new int[]{u,w});
    }
    dfs(1,vis,map);
    return result;
    }
    void dfs(int i,boolean[]vis, Map<Integer,List<int[]>>map){
        vis[i]=true;
        for(int[]value:map.get(i)){
            int v=value[0];
            int dis=value[1];
                result=Math.min(result,dis);
            if(!vis[v]){
                dfs(v,vis,map);
        }
        }
    }
    
}