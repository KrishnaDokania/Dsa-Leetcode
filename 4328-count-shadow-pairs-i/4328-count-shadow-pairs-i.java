class Solution {
       public long shadowPairs(int[] A) {
        long res = 0;
        int[] s = new int[A.length];
        int k = 0;
        for (int a : A) {
            while (k > 0 && s[k - 1] > a) {
                k--;
            }
            int l = 0, r = k;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (s[mid] < a)
                    l = mid + 1;
                else
                    r = mid;
            }
            res += l;
            s[k++] = a;
        }
        return res;
    }
}