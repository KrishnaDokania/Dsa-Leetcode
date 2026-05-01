class Solution {
    int m, n;
    int[][][] dp;

    public int maxPathScore(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        dp = new int[m][n][k + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -2); // -2 = unvisited
            }
        }

        int res = solve(0, 0, 0, grid, k);
        return res < 0 ? -1 : res;
    }

    int solve(int i, int j, int cost, int[][] grid, int k) {

        if (i >= m || j >= n) return -1;

        int newCost = cost + (grid[i][j] == 0 ? 0 : 1);
        if (newCost > k) return -1;

        // base case
        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        if (dp[i][j][newCost] != -2) return dp[i][j][newCost];

        int right = solve(i, j + 1, newCost, grid, k);
        int down = solve(i + 1, j, newCost, grid, k);

        int best = Math.max(right, down);

        if (best == -1) return dp[i][j][newCost] = -1;

        return dp[i][j][newCost] = best + grid[i][j];
    }
}