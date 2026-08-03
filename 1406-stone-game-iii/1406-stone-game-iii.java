class Solution {
    int[] dp;
    int[] stoneValue;
    int n;

    public String stoneGameIII(int[] stoneValue) {
        this.stoneValue = stoneValue;
        n = stoneValue.length;

        dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);

        int diff = solve(0);

        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }

    int solve(int i) {
        if (i >= n) return 0;

        if (dp[i] != Integer.MIN_VALUE)
            return dp[i];

        int sum = 0;
        int best = Integer.MIN_VALUE;

        for (int k = 0; k < 3 && i + k < n; k++) {
            sum += stoneValue[i + k];
            best = Math.max(best, sum - solve(i + k + 1));
        }

        return dp[i] = best;
    }
}