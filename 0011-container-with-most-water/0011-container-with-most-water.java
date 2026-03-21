class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        int area2 = 0;
        int totalarea = 0;
        while (right > left) {
            if (height[left] > height[right]) {
                area = Math.min(height[left], height[right]) * (right - left);       
                right--;
            } else if (height[left] <= height[right]) {
                area2 = Math.min(height[left], height[right]) * (right - left);   
                left++;

            }
            area = Math.max(area, area2);
            totalarea=Math.max(area,totalarea);

        }
        return totalarea;
    }

}
