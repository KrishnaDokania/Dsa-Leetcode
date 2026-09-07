class Solution {

    int mod = 1000000007;
    int[] dp;
    int[] prev;

    public int distinctSubseqII(String s) {

        int n = s.length();

        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        prev = new int[n];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {

            int c = s.charAt(i) - 'a';

            prev[i] = last[c];

            last[c] = i;
        }
        return (solve(s, n) - 1 + mod) % mod;
    }

    int solve(String s, int i) {

        if (i == 0)
            return 1;

        if (dp[i] != -1)
            return dp[i];

        long ans = 2L * solve(s, i - 1);

        int previous = prev[i - 1];

        if (previous != -1) {
            ans -= solve(s, previous);
        }

        ans = (ans % mod + mod) % mod;

        return dp[i] = (int) ans;
    }
}