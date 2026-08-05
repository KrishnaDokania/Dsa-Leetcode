class Solution {
    boolean check[];
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>>adj=new ArrayList<>();
        check=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]i:invocations){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
        }
        dfs(k,adj);
               for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            if (!check[u] && check[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                result.add(i);
            }
        }

        return result;
    }
    void dfs(int root,List<List<Integer>>adj){
        if(check[root]==true)return;
        check[root]=true;
        for(int neigh:adj.get(root)){
            dfs(neigh,adj);    
            }
    }
}