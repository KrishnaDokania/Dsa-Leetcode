class Solution {

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : invocations) {
            adj.get(edge[0]).add(edge[1]);
        }

        boolean[] suspicious = new boolean[n];

        dfs(k, adj, suspicious);

        // If any non-suspicious method calls a suspicious one,
        // we cannot remove anything.
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            if (!suspicious[u] && suspicious[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    ans.add(i);
                return ans;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!suspicious[i])
                ans.add(i);
        }

        return ans;
    }

    void dfs(int node, List<List<Integer>> adj, boolean[] suspicious) {

        suspicious[node] = true;

        for (int neigh : adj.get(node)) {
            if (!suspicious[neigh]) {
                dfs(neigh, adj, suspicious);
            }
        }
    }
}