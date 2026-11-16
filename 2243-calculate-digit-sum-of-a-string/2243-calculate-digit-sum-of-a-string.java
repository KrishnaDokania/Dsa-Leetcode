class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();

        while (n > k) {
            String result = "";

            for (int i = 0; i < n; i += k) {
                int sum = 0;

                for (int j = i; j < Math.min(i + k, n); j++) {
                    sum += s.charAt(j) - '0';
                }

                result += sum;
            }

            s = result;
            n = s.length();
        }

        return s;
    }
}