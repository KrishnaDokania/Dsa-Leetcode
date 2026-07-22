class Group {
    int start;
    int length;
    Group(int start, int length) {
        this.start = start;
        this.length = length;
    }
}

class SparseTable {
    private final int n;
    private final int[][] st; // st[i][j] := max(nums[j..j + 2^i - 1])

    SparseTable(int[] nums) {
        n = nums.length;
        st = new int[bitLength(Math.max(n, 1)) + 1][n + 1];
        System.arraycopy(nums, 0, st[0], 0, n);
        for (int i = 1; i < st.length; ++i)
            for (int j = 0; j + (1 << i) <= n; ++j)
                st[i][j] = Math.max(st[i - 1][j], st[i - 1][j + (1 << (i - 1))]);
    }

    int query(int l, int r) {
        final int i = bitLength(r - l + 1) - 1;
        return Math.max(st[i][l], st[i][r - (1 << i) + 1]);
    }

    private int bitLength(int n) {
        return Integer.SIZE - Integer.numberOfLeadingZeros(n);
    }
}

class Solution {
    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
        final int n = s.length();
        int onesCount = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == '1') onesCount++;
        final int ones = onesCount;

        List<Group> zeroGroups = new ArrayList<>();
        int[] zeroGroupIndex = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (i > 0 && s.charAt(i - 1) == '0')
                    zeroGroups.get(zeroGroups.size() - 1).length++;
                else
                    zeroGroups.add(new Group(i, 1));
            }
            zeroGroupIndex[i] = zeroGroups.size() - 1;
        }

        List<Integer> ans = new ArrayList<>();
        if (zeroGroups.isEmpty()) {
            for (int[] q : queries) ans.add(ones);
            return ans;
        }

        int[] zeroMergeLengths = new int[Math.max(zeroGroups.size() - 1, 0)];
        for (int i = 0; i < zeroGroups.size() - 1; ++i)
            zeroMergeLengths[i] = zeroGroups.get(i).length + zeroGroups.get(i + 1).length;

        SparseTable st = zeroMergeLengths.length > 0 ? new SparseTable(zeroMergeLengths) : null;

        for (int[] query : queries) {
            final int l = query[0];
            final int r = query[1];

            final int left = zeroGroupIndex[l] == -1 ? -1
                    : (zeroGroups.get(zeroGroupIndex[l]).length - (l - zeroGroups.get(zeroGroupIndex[l]).start));
            final int right = zeroGroupIndex[r] == -1 ? -1
                    : (r - zeroGroups.get(zeroGroupIndex[r]).start + 1);

            final int startAdjacentGroupIndex = zeroGroupIndex[l] + 1;
            final int endGroupIndexRaw = s.charAt(r) == '1' ? zeroGroupIndex[r] : zeroGroupIndex[r] - 1;
            final int endAdjacentGroupIndex = endGroupIndexRaw - 1;

            int activeSections = ones;

            if (s.charAt(l) == '0' && s.charAt(r) == '0' && zeroGroupIndex[l] + 1 == zeroGroupIndex[r]) {
                activeSections = Math.max(activeSections, ones + left + right);
            } else if (st != null && startAdjacentGroupIndex <= endAdjacentGroupIndex) {
                activeSections = Math.max(activeSections,
                        ones + st.query(startAdjacentGroupIndex, endAdjacentGroupIndex));
            }

            if (s.charAt(l) == '0' && zeroGroupIndex[l] + 1 <= endGroupIndexRaw) {
                activeSections = Math.max(activeSections,
                        ones + left + zeroGroups.get(zeroGroupIndex[l] + 1).length);
            }

            if (s.charAt(r) == '0' && zeroGroupIndex[l] < zeroGroupIndex[r] - 1) {
                activeSections = Math.max(activeSections,
                        ones + right + zeroGroups.get(zeroGroupIndex[r] - 1).length);
            }

            ans.add(activeSections);
        }

        return ans;
    }
}