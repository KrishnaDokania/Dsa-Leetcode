class Solution {

    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return 1;

        int max = nums[0];
        int min = nums[0];

        int ind_max = 0;
        int ind_min = 0;

        for (int i = 1; i < n; i++) {

            if (nums[i] > max) {
                max = nums[i];
                ind_max = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                ind_min = i;
            }
        }

        int left = Math.min(ind_min, ind_max);
        int right = Math.max(ind_min, ind_max);

        // Delete both from front
        int front = right + 1;

        // Delete both from back
        int back = n - left;

        // Delete one from front and one from back
        int both = (left + 1) + (n - right);

        return Math.min(front, Math.min(back, both));
    }
}