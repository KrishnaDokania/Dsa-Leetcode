class Solution {
    int row;
    int col;
    int ancestor[][];
    int depth[];
    int mod = 1000000007;
    List<List<Integer>> adj;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        row = edges.length+ 1;
        col =(int)Math.ceil(Math.log(row) / Math.log(2)) + 1; 
        adj = new ArrayList<>();
        ancestor = new int[row][col];
        depth = new int[row];
        for (int i = 0; i <row; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0]-1;
            int v = edge[1]-1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for (int[] x : ancestor)
            Arrays.fill(x, -1);
        dfs(0, -1);
        buildancestor();
        int power[] = new int[row];
        power[0] = 1;
        for (int i = 1; i < row; i++) {
            power[i] = 2 * power[i - 1] % mod;
        }
        int i = 0;
        int []result=new int[queries.length];
        for (int query []: queries) {
            int u = query[0] - 1;
            int v = query[1] - 1;
            int lca = findlca(u, v);
            int d = depth[u] + depth[v] -2 * depth[lca];
            if (d == 0) {
                result[i] = 0;
            } else {
                result[i] = power[d - 1];
            }
            i++;
        }
        return result;
    }

    void buildancestor() {
        for (int j = 1; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (ancestor[i][j - 1] !=-1)
                    ancestor[i][j] = ancestor[ancestor[i][j - 1]][j - 1];
            }
        }
    }

    void dfs(int root, int parent) {
        ancestor[root][0] = parent;
        for (int neigh : adj.get(root)) {
            if (neigh == parent)
                continue;
            depth[neigh] = depth[root] + 1;
            dfs(neigh, root);
        }
    }

    public int findlca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        int k = depth[u] - depth[v];
        for (int j = 0; j < col; j++) {
            if ((k & (1 << j))!=0)
                u = ancestor[u][j];
        }
        if(u==v)return u;
        for(int j=col-1;j>=0;j--){
                if(ancestor[u][j] != -1 && ancestor[u][j]!=ancestor[v][j]){
                u=ancestor[u][j];
                v=ancestor[v][j];
            }
        }
            return ancestor[u][0];
    }
}
