class Solution {
    int[] dp;
    int[] stone;
    int n;

    public String stoneGameIII(int[] stoneValue) {
        stone = stoneValue;
        n = stone.length;

        dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);

        int diff = solve(0);

        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }

    int solve(int i) {
        if (i >= n)
            return 0;

        if (dp[i] != Integer.MIN_VALUE)
            return dp[i];

        int take1 = stone[i] - solve(i + 1);

        int take2 = Integer.MIN_VALUE;
        if (i + 1 < n)
            take2 = stone[i] + stone[i + 1] - solve(i + 2);

        int take3 = Integer.MIN_VALUE;
        if (i + 2 < n)
            take3 = stone[i] + stone[i + 1] + stone[i + 2] - solve(i + 3);

        return dp[i] = Math.max(take1, Math.max(take2, take3));
    }
}