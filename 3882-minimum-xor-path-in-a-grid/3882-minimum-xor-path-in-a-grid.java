class Solution {
    int m, n;
    boolean[][][] visited;

    public int minCost(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        visited = new boolean[m][n][1024];

        solve(0, 0, grid[0][0], grid);

        for (int x = 0; x < 1024; x++) {
            if (visited[m - 1][n - 1][x]) {
                return x;
            }
        }

        return 0;
    }

    void solve(int i, int j, int xor, int[][] grid) {
        if (i >= m || j >= n || visited[i][j][xor]) {
            return;
        }

        visited[i][j][xor] = true;

        if (j + 1 < n) {
            solve(i, j + 1, xor ^ grid[i][j + 1], grid);
        }

        if (i + 1 < m) {
            solve(i + 1, j, xor ^ grid[i + 1][j], grid);
        }
    }
}